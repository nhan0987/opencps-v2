package org.opencps.dossiermgt.action.impl;

import java.util.LinkedHashMap;

import org.opencps.dossiermgt.action.StatisticActions;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;

import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class StatisticActionsImpl implements StatisticActions {

	@Override
	public long countTodoTest(long userId, long companyId, long groupId, LinkedHashMap<String, Object> params,
			Object object, ServiceContext serviceContext) {

		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(companyId);
		String statusCode = StringPool.BLANK;
//		JSONArray statistics = JSONFactoryUtil.createJSONArray();
		long total = 0;
		try {
			statusCode = GetterUtil.getString(params.get(DossierTerm.STATUS));
			if (Validator.isNotNull(statusCode)) {
				total = DossierLocalServiceUtil.countLucene(params, searchContext);
			}
		} catch (Exception e) {
			// _log.error(e);
		}

		return total;
	}

}
