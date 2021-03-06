/**
 * 
 */

package org.opencps.zalo.hook.utils;

import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.ws.rs.core.MediaType;

import org.opencps.communication.constants.SendSMSTerm;
import org.opencps.communication.model.ServerConfig;
import org.opencps.communication.service.ServerConfigLocalServiceUtil;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.zalo.hook.constants.ZaloHookConstantKeys;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author thanhnv
 */
public class ZaloMapUtilsV2 {

	public static void doAction(String zaloInfoStr) {

		try {

			JSONObject zaloInfo = JSONFactoryUtil.createJSONObject(zaloInfoStr);

			if (ZaloHookConstantKeys.ZALO_V2_ACTION_USER_SEND_TEXT.equalsIgnoreCase(
				zaloInfo.getString(
					ZaloHookConstantKeys.ZALO_V2_PARAM_EVENT_NAME))) {

				String message = zaloInfo.getJSONObject(
					ZaloHookConstantKeys.ZALO_V2_PARAM_MESSAGE).getString(
						ZaloHookConstantKeys.ZALO_V2_PARAM_MESSAGE_TEXT);

				String toUId = zaloInfo.getJSONObject(
					ZaloHookConstantKeys.ZALO_V2_PARAM_SENDER).getString(
						ZaloHookConstantKeys.ZALO_V2_PARAM_SENDER_ID);

				String[] messages = message.split(StringPool.SPACE);

				if (messages[0].equalsIgnoreCase(
					ZaloHookConstantKeys.ZALO_MESSAGE_SYNTAX_SEARCH_DOSSIER)) {

					_searchDossier(messages[1], messages[2], toUId);
				}

			}
		}
		catch (Exception e) {

			_log.error(e);
		}
	}

	private static void _searchDossier(
		String dossierNo, String password, String toUId) {

		try {

			JSONObject zaloConfig = _getZaloConfig();
			Dossier dossier = DossierLocalServiceUtil.getByDossierNo(
				zaloConfig.getLong(SendSMSTerm.ZALO_GROUPID), dossierNo);
			String message;

			if (Validator.isNull(dossier)) {

				message = zaloConfig.getString(
					SendSMSTerm.ZALO_DOSSIER_NOT_FOUND_MES);

			}
			else if (!dossier.getPassword().equalsIgnoreCase(password)) {

				message = zaloConfig.getString(
					SendSMSTerm.ZALO_DOSSIER_ERROR_SECRET_MES);

			}
			else {

				message =
					zaloConfig.getString(SendSMSTerm.ZALO_DOSSIER_SUCCESS_MES);
				message = message.replaceAll(
					zaloConfig.getString(SendSMSTerm.ZALO_DOSSIER_NO_REPLACE),
					dossierNo);
				message = message.replaceAll(
					zaloConfig.getString(
						SendSMSTerm.ZALO_DOSSIER_STATUS_REPLACE),
					dossier.getDossierStatusText());
			}

			_sendZalo(message, toUId, zaloConfig);
		}
		catch (Exception e) {

			_log.error(e);
		}

	}

	private static JSONObject _getZaloConfig() {

		JSONObject zaloInfoConfig = JSONFactoryUtil.createJSONObject();

		try {

			ServerConfig sc = ServerConfigLocalServiceUtil.getByCode(
				SendSMSTerm.SERVER_CONFIG_SERVERNO_ZALO);

			zaloInfoConfig = JSONFactoryUtil.createJSONObject(sc.getConfigs());
		}
		catch (Exception e) {
			_log.error(e);
		}

		return zaloInfoConfig;
	}

	private static void _sendZalo(
		String messageCode, String zaloUid, JSONObject zaloConfig) {

		try {

			JSONObject zaloConfigInfo = zaloConfig;
			if (Validator.isNull(zaloConfig)) {
				zaloConfigInfo = _getZaloConfig();
			}
			String oAIdToken =
				zaloConfigInfo.getString(SendSMSTerm.OAID_TOKEN_ACCESS);
			String textMessage = zaloConfigInfo.getString(messageCode);

			textMessage =
				Validator.isNotNull(textMessage) ? textMessage : messageCode;

			if (Validator.isNotNull(textMessage) &&
				Validator.isNotNull(zaloUid) &&
				Validator.isNotNull(oAIdToken)) {

				String targetURL =
					ConfigProps.get(ZaloHookConstantKeys.ZALO_ENPOINT) + oAIdToken;

				JSONObject payloadJSON = JSONFactoryUtil.createJSONObject(
					ConfigProps.get(ZaloHookConstantKeys.ZALO_PAYLOAD));
				JSONObject recipient = JSONFactoryUtil.createJSONObject();
				JSONObject message = JSONFactoryUtil.createJSONObject();

				recipient.put(ZaloHookConstantKeys.ZALO_V2_ACTION_POST_USER_ID, zaloUid);

				message.put(ZaloHookConstantKeys.ZALO_V2_ACTION_POST_TEXT, textMessage);

				payloadJSON.put(ZaloHookConstantKeys.ZALO_V2_ACTION_POST_RECIPIENT, recipient);

				payloadJSON.put(ZaloHookConstantKeys.ZALO_V2_ACTION_POST_MESSAGE, message);

				_postMessZalo(targetURL, payloadJSON.toJSONString());
			}

		}
		catch (JSONException e) {
			_log.error(e);
		}

	}

	private static void _postMessZalo(String url, String param) {

		try {
			String charset = ConfigProps.get(ZaloHookConstantKeys.ZALO_V2_ACTION_POST_API_CHARSET);
			URLConnection connection = new URL(url).openConnection();
			connection.setDoOutput(true); // Triggers POST.
			connection.setRequestProperty(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);

			OutputStream output = connection.getOutputStream();
			output.write(param.getBytes(charset));

			connection.getInputStream();
			_log.debug("Send zalo message success");
		}
		catch (Exception e) {
			_log.error(e);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(ZaloMapUtilsV2.class);

}
