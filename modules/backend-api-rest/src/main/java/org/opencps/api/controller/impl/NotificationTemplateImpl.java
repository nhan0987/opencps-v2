package org.opencps.api.controller.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import java.net.HttpURLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.opencps.api.constants.ConstantUtils;
import org.opencps.api.controller.NotificationTemplateManagement;
import org.opencps.api.controller.util.MessageUtil;
import org.opencps.api.controller.util.NotificationTemplateUtils;
import org.opencps.api.error.model.ErrorMsg;
import org.opencps.api.notificationtemplate.model.DataSearchModel;
import org.opencps.api.notificationtemplate.model.NotificationtemplateInputModel;
import org.opencps.api.notificationtemplate.model.NotificationtemplateModel;
import org.opencps.api.notificationtemplate.model.NotificationtemplateResults;
import org.opencps.communication.action.NotificationTemplateInterface;
import org.opencps.communication.action.impl.NotificationTemplateActions;
import org.opencps.communication.model.Notificationtemplate;

import backend.auth.api.exception.BusinessExceptionImpl;

public class NotificationTemplateImpl implements NotificationTemplateManagement {

//	private static final Log _log = LogFactoryUtil.getLog(NotificationTemplateImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public Response getNotificationtemplates(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, DataSearchModel query) {
		NotificationTemplateInterface actions = new NotificationTemplateActions();
		NotificationtemplateResults result = new NotificationtemplateResults();

		try {

			if (query.getEnd() == 0) {
				query.setStart(QueryUtil.ALL_POS);
				query.setEnd(QueryUtil.ALL_POS);
			}

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(ConstantUtils.API_KEYWORDS_KEY, query.getKeywords());

			Sort[] sorts = new Sort[] { SortFactoryUtil.create(ConstantUtils.NOTIFICATION_TYPE_SORTABLE, Sort.STRING_TYPE,
					Boolean.valueOf(query.getOrder())) };

			JSONObject jsonData = actions.getNotificationTemplates(user.getUserId(), company.getCompanyId(), groupId,
					params, sorts, query.getStart(), query.getEnd(), serviceContext);

			result.setTotal(jsonData.getLong(ConstantUtils.TOTAL));
			result.getNotificationtemplateModel().addAll(
					NotificationTemplateUtils.mapperNotificationtemplateList((List<Document>) jsonData.get(ConstantUtils.DATA)));

			return Response.status(HttpURLConnection.HTTP_OK).entity(result).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@Override
	public Response read(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, String type) {

		NotificationTemplateInterface actions = new NotificationTemplateActions();
		NotificationtemplateModel notificationtemplateModel;

		long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

		Notificationtemplate notificationtemplate = actions.read(user.getUserId(), groupId, type, serviceContext);

		if (Validator.isNotNull(notificationtemplate)) {

			notificationtemplateModel = NotificationTemplateUtils.mapperNotificationtemplateModel(notificationtemplate);

			return Response.status(HttpURLConnection.HTTP_OK).entity(notificationtemplateModel).build();

		} else {

			ErrorMsg error = new ErrorMsg();

			error.setMessage(MessageUtil.getMessage(ConstantUtils.API_MESSAGE_NOTFOUND));
			error.setCode(HttpURLConnection.HTTP_NOT_FOUND);
			error.setDescription(MessageUtil.getMessage(ConstantUtils.API_MESSAGE_NOTFOUND));

			return Response.status(HttpURLConnection.HTTP_NOT_FOUND).entity(error).build();

		}
	}

	@Override
	public Response update(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, String type, NotificationtemplateInputModel input) {
		NotificationTemplateInterface actions = new NotificationTemplateActions();
		NotificationtemplateModel notificationtemplateModel = new NotificationtemplateModel();

		try {

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			String sendEmail = String.valueOf(input.getSendEmail());
			String notificationType = type;
			String emailSubject = input.getEmailSubject();
			String emailBody = input.getEmailBody();
			String textMessage = input.getTextMessage();
			String sendSMS = String.valueOf(input.getSendSMS());
			String expireDuration = String.valueOf(input.getExpireDuration());
			String userUrlPattern = input.getUserUrlPattern();
			String guestUrlPattern = input.getGuestUrlPattern();
			String interval = input.getInterval();
			String grouping = String.valueOf(input.getGrouping());
			
			Notificationtemplate notificationtemplate = actions.update(user.getUserId(), groupId, notificationType,
					emailBody, emailSubject, sendEmail, textMessage,
					sendSMS, expireDuration, userUrlPattern,
					guestUrlPattern, interval, grouping, serviceContext);

			notificationtemplateModel = NotificationTemplateUtils.mapperNotificationtemplateModel(notificationtemplate);

			return Response.status(HttpURLConnection.HTTP_OK).entity(notificationtemplateModel).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@Override
	public Response delete(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, String type) {
		NotificationTemplateInterface actions = new NotificationTemplateActions();

		try {

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			boolean flag = actions.delete(user.getUserId(), groupId, type, serviceContext);

			if (flag) {

				return Response.status(HttpURLConnection.HTTP_OK).build();

			} else {

				ErrorMsg error = new ErrorMsg();

				error.setMessage(MessageUtil.getMessage(ConstantUtils.API_MESSAGE_NOTFOUND));
				error.setCode(HttpURLConnection.HTTP_NOT_FOUND);
				error.setDescription(MessageUtil.getMessage(ConstantUtils.API_MESSAGE_NOTFOUND));

				return Response.status(HttpURLConnection.HTTP_NOT_FOUND).entity(error).build();

			}

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@Override
	public Response create(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, NotificationtemplateInputModel input) {
		NotificationTemplateInterface actions = new NotificationTemplateActions();
		NotificationtemplateModel notificationtemplateModel = new NotificationtemplateModel();

		try {

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			String sendEmail = String.valueOf(input.getSendEmail());
			String notificationType = input.getNotificationType();
			String emailSubject = input.getEmailSubject();
			String emailBody = input.getEmailBody();
			String textMessage = input.getTextMessage();
			String expireDuration = String.valueOf(input.getExpireDuration());
			String userUrlPattern = input.getUserUrlPattern();
			String guestUrlPattern = input.getGuestUrlPattern();
			String interval = input.getInterval();
			String grouping = String.valueOf(input.getGrouping());
			String textSMS = input.getTextSMS();
			
			Notificationtemplate notificationtemplate = actions.create(user.getUserId(), groupId, notificationType,
					emailBody, emailSubject, sendEmail, textMessage,
					textSMS, expireDuration, userUrlPattern,
					guestUrlPattern, interval, grouping, serviceContext);

			notificationtemplateModel = NotificationTemplateUtils.mapperNotificationtemplateModel(notificationtemplate);

			return Response.status(HttpURLConnection.HTTP_OK).entity(notificationtemplateModel).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

}
