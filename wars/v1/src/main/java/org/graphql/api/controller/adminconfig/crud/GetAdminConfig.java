package org.graphql.api.controller.adminconfig.crud;

import org.opencps.adminconfig.model.AdminConfig;
import org.opencps.adminconfig.service.AdminConfigLocalServiceUtil;
import org.opencps.dossiermgt.action.util.ConstantUtils;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

/**
 * Created binhth
 */
@Component
public class GetAdminConfig implements DataFetcher<AdminConfig> {

	@Override
	public AdminConfig get(DataFetchingEnvironment dataFetchingEnvironment) {

		String code = dataFetchingEnvironment.getArgument(ConstantUtils.VALUE_CODE);

		AdminConfig adminConfig = AdminConfigLocalServiceUtil.fetchByCode(code);

		return adminConfig;

	}
}
