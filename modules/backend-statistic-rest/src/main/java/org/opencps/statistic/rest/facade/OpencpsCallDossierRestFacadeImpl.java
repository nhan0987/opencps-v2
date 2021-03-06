package org.opencps.statistic.rest.facade;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.security.auth.http.HttpAuthorizationHeader;
import com.liferay.portal.kernel.util.Validator;

import java.time.LocalDate;
import java.util.Base64;
import java.util.HashMap;

import org.opencps.statistic.rest.dto.GetDossierRequest;
import org.opencps.statistic.rest.dto.GetDossierResponse;
import org.opencps.statistic.rest.util.DossierConstants;
import org.opencps.statistic.rest.util.DossierStatisticConfig;
import org.opencps.statistic.rest.util.DossierStatisticConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import opencps.statistic.common.webservice.exception.UpstreamServiceFailedException;
import opencps.statistic.common.webservice.exception.UpstreamServiceTimedOutException;
import opencps.statistic.common.webservice.facade.OpencpsRestFacade;

public class OpencpsCallDossierRestFacadeImpl extends OpencpsRestFacade<GetDossierRequest, GetDossierResponse>
		implements OpencpsCallRestFacade<GetDossierRequest, GetDossierResponse> {

	private final static Logger LOG = LoggerFactory.getLogger(OpencpsCallDossierRestFacadeImpl.class);

	private static final String QUERY_PARAM_MONTH = "month";
	private static final String QUERY_PARAM_YEAR = "year";
	private static final String QUERY_PARAM_AGENCY = "agency";
	private static final String QUERY_PARAM_FROM_STATISTIC_DATE = "fromStatisticDate";
	private static final String QUERY_PARAM_TO_STATISTIC_DATE ="toStatisticDate";
	private static final String QUERY_PARAM_SYSTEM_ID ="systemId";
	private static final String QUERY_PARAM_TOP = "top";
	private static final String QUERY_PARAM_START = "start";
	private static final String QUERY_PARAM_END = "end";

	@Override
	public GetDossierResponse callRestService(GetDossierRequest payload)
			throws UpstreamServiceTimedOutException, UpstreamServiceFailedException {
		return makeServiceCall(payload);
	}

/*	@Override
	protected GetDossierResponse makeServiceCall(GetDossierRequest payload)
			throws UpstreamServiceTimedOutException, UpstreamServiceFailedException {
		
		MultiValueMap<String, String> urlQueryParams = new LinkedMultiValueMap<>();
		
		//buildUrlQueryParams(urlQueryParams, payload);
		
		String endPoint = DossierStatisticConfig.get(DossierStatisticConstants.DOSSIER_ENDPOINT);

		//LOG.info(endPoint);

		// get the params for EE
		HashMap<String, String> urlPathSegments = new HashMap<>();

		// build the url
		String url = buildUrl(endPoint, urlPathSegments, urlQueryParams);
		
		//LOG.info(url);

		HttpHeaders httpHeaders = new HttpHeaders();

		httpHeaders.add(DossierStatisticConstants.GROUP_ID, Long.toString(payload.getGroupId()));

		return executeGenericRestCall(url, HttpMethod.GET, httpHeaders, payload, GetDossierResponse.class).getBody();

	}*/
	
	protected GetDossierResponse makeServiceCall(GetDossierRequest payload)
			throws UpstreamServiceTimedOutException, UpstreamServiceFailedException {
		
		MultiValueMap<String, String> urlQueryParams = new LinkedMultiValueMap<>();
		if (payload.isCalculate()) {
			if (payload.getMonth() != null) {
				urlQueryParams.add(QUERY_PARAM_MONTH, payload.getMonth());
			}
			else {
				urlQueryParams.add(QUERY_PARAM_MONTH, Integer.toString(LocalDate.now().getMonthValue()));
			}
			if (payload.getYear() != null) {
				urlQueryParams.add(QUERY_PARAM_YEAR, payload.getYear());
			}
			else {
				urlQueryParams.add(QUERY_PARAM_YEAR, Integer.toString(LocalDate.now().getYear()));
			}
		} else {
			if (Validator.isNotNull(payload.getGovAgencyCode())) {
				urlQueryParams.add(QUERY_PARAM_AGENCY, payload.getGovAgencyCode());
			}
			if (Validator.isNotNull(payload.getFromStatisticDate())) {
				urlQueryParams.add(QUERY_PARAM_FROM_STATISTIC_DATE, payload.getFromStatisticDate());
			}
			if (Validator.isNotNull(payload.getToStatisticDate())) {
				urlQueryParams.add(QUERY_PARAM_TO_STATISTIC_DATE, payload.getToStatisticDate());
			}
			//System.out.println("fromStatisticDate: "+urlQueryParams.get("fromStatisticDate"));
			//System.out.println("toStatisticDate: "+urlQueryParams.get("toStatisticDate"));
			//Process tranfer params using search dossier
			buildUrlQueryParams(urlQueryParams, payload);
		}
		//Add common params
		urlQueryParams.add(QUERY_PARAM_SYSTEM_ID, DossierStatisticConstants.ALL_SYSTEM);
		urlQueryParams.add(QUERY_PARAM_TOP, DossierStatisticConstants.TOP_STATISTIC);

		if (payload.getStart() != 0) {
			urlQueryParams.add(QUERY_PARAM_START, String.valueOf(payload.getStart()));			
		}
		else {
			urlQueryParams.add(QUERY_PARAM_START, String.valueOf(QueryUtil.ALL_POS));
		}
		if (payload.getEnd() != 0) {
			urlQueryParams.add(QUERY_PARAM_END, String.valueOf(payload.getEnd()));
		}
		else {
			urlQueryParams.add(QUERY_PARAM_END, String.valueOf(QueryUtil.ALL_POS));
		}
		//System.out.println("fromStatisticDate: "+urlQueryParams.get("fromStatisticDate"));
		//System.out.println("toStatisticDate: "+urlQueryParams.get("toStatisticDate"));
		//System.out.println("month: "+urlQueryParams.get("month"));
		//System.out.println("year: "+urlQueryParams.get("year"));
		//System.out.println("top: "+urlQueryParams.get("top"));
		
		String endPoint = Validator.isNotNull(payload.getEndpoint()) ? payload.getEndpoint() : DossierStatisticConfig.get(DossierStatisticConstants.DOSSIER_ENDPOINT);
		HashMap<String, String> urlPathSegments = new HashMap<>();
		String url = buildUrl(endPoint, urlPathSegments, urlQueryParams);
		// LOG.info(url);
		HttpHeaders httpHeaders = new HttpHeaders();
		
		//DossierStatisticUtils.logAsFormattedJson(LOG, httpHeaders);
		
		httpHeaders.add(Field.GROUP_ID, Long.toString(payload.getGroupId()));
//		if (Validator.isNotNull(PropsUtil.get(ServerConfigContants.SERVER_SYNC_KEY))
//				&& Validator.isNotNull(PropsUtil.get(ServerConfigContants.SERVER_SYNC_SECRET))) {
//			setHttpHeadersAuthorization(httpHeaders, PropsUtil.get(ServerConfigContants.SERVER_SYNC_KEY), PropsUtil.get(ServerConfigContants.SERVER_SYNC_SECRET));
//		}
//		else {
//			httpHeaders.add("Authorization", "Basic " + DossierStatisticConfig.get(DossierStatisticConstants.OPENCPS_AUTHENCATION));
//		}
		if (Validator.isNotNull(payload.getUsername()) && Validator.isNotNull(payload.getPassword())) {
			httpHeaders.add(HttpHeaders.AUTHORIZATION, HttpAuthorizationHeader.SCHEME_BASIC + StringPool.SPACE + Base64.getEncoder().encodeToString((payload.getUsername() + StringPool.COLON + payload.getPassword()).getBytes()));			
		}

		return (GetDossierResponse) this
				.executeGenericRestCall(url, HttpMethod.GET, httpHeaders, payload, GetDossierResponse.class).getBody();
	}

	private void buildUrlQueryParams(MultiValueMap<String, String> urlQueryParams, GetDossierRequest dossierRequest) {
		//urlQueryParams.add(DossierConstants.REGISTERBOOKCODE, dossierRequest.getRegisterBookCode());
		//urlQueryParams.add(DossierConstants.PROCESSNO, dossierRequest.getProcessNo());
		urlQueryParams.add(DossierConstants.DOSSIER_STATUS, dossierRequest.getStatus());
		urlQueryParams.add(DossierConstants.DOSSIER_SUB_STATUS, dossierRequest.getSubstatus());
		urlQueryParams.add(DossierConstants.SERVICECODE, dossierRequest.getServiceCode());
		urlQueryParams.add(DossierConstants.ONLINE, dossierRequest.getOnlineStatistic());
		urlQueryParams.add(DossierConstants.ORIGINALITY, dossierRequest.getOriginality());
		urlQueryParams.add(DossierConstants.TEMPLATE, dossierRequest.getTemplate());
		urlQueryParams.add(DossierConstants.STEP, dossierRequest.getStep());
		//urlQueryParams.add(DossierConstants.TOP, dossierRequest.getTop());
		urlQueryParams.add(DossierConstants.DOSSIER_NO, dossierRequest.getDossierNo());
		//urlQueryParams.add(DossierConstants.GOVAGENCYCODE, dossierRequest.getGovAgencyCode());
		//urlQueryParams.add(DossierConstants.APPLICANTIDTYPE, dossierRequest.getApplicantIdType());
		//urlQueryParams.add(DossierConstants.APPLICANTIDNO, dossierRequest.getApplicantIdNo());
		//urlQueryParams.add(DossierConstants.CITYCODE, dossierRequest.getCityCode());
		//urlQueryParams.add(DossierConstants.DISTRICTCODE, dossierRequest.getDistrictCode());
		//urlQueryParams.add(DossierConstants.WARDCODE, dossierRequest.getWardCode());
		//urlQueryParams.add(DossierConstants.CONTACTTELNO, dossierRequest.getContactTelNo());
		//urlQueryParams.add(DossierConstants.CONTACTEMAIL, dossierRequest.getContactEmail());
		//urlQueryParams.add(DossierConstants.DELEGATEIDNO, dossierRequest.getDelegateIdNo());
		//urlQueryParams.add(DossierConstants.DELEGATETELNO, dossierRequest.getDelegateTelNo());
		//urlQueryParams.add(DossierConstants.DOSSIERSTATUS, dossierRequest.getDossierStatus());
		//urlQueryParams.add(DossierConstants.DOSSIERSUBSTATUS, dossierRequest.getDossierSubStatus());
		//urlQueryParams.add(DossierConstants.DOSSIERACTIONID, Long.toString(dossierRequest.getDossierActionId()));
		//urlQueryParams.add(DossierConstants.VIAPOSTAL, Integer.toString(dossierRequest.getViaPostal()));
		//urlQueryParams.add(DossierConstants.SERVERNO, dossierRequest.getServerNo());
		//urlQueryParams.add(DossierConstants.ORIGINDOSSIERID, Long.toString(dossierRequest.getOriginDossierId()));
		//urlQueryParams.add(DossierConstants.UNDUE, Boolean.toString(dossierRequest.isUndue()));
		//urlQueryParams.add(DossierConstants.BETIME, Boolean.toString(dossierRequest.isBetime()));
		//urlQueryParams.add(DossierConstants.ONTIME, Boolean.toString(dossierRequest.isOntime()));
		//urlQueryParams.add(DossierConstants.RECEIVED, Boolean.toString(dossierRequest.isReceived()));
		//urlQueryParams.add(DossierConstants.RELEASED, Boolean.toString(dossierRequest.isReleased()));
	}

}
