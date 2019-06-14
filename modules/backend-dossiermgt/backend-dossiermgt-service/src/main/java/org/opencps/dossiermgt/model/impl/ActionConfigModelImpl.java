/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import org.opencps.dossiermgt.model.ActionConfig;
import org.opencps.dossiermgt.model.ActionConfigModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ActionConfig service. Represents a row in the &quot;opencps_actionconfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ActionConfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ActionConfigImpl}.
 * </p>
 *
 * @author huymq
 * @see ActionConfigImpl
 * @see ActionConfig
 * @see ActionConfigModel
 * @generated
 */
@ProviderType
public class ActionConfigModelImpl extends BaseModelImpl<ActionConfig>
	implements ActionConfigModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a action config model instance should use the {@link ActionConfig} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_actionconfig";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "actionConfigId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "actionCode", Types.VARCHAR },
			{ "actionName", Types.VARCHAR },
			{ "extraForm", Types.BOOLEAN },
			{ "formConfig", Types.VARCHAR },
			{ "sampleData", Types.VARCHAR },
			{ "insideProcess", Types.BOOLEAN },
			{ "userNote", Types.INTEGER },
			{ "syncType", Types.INTEGER },
			{ "eventType", Types.INTEGER },
			{ "infoType", Types.INTEGER },
			{ "pending", Types.BOOLEAN },
			{ "rollbackable", Types.BOOLEAN },
			{ "notificationType", Types.VARCHAR },
			{ "documentType", Types.VARCHAR },
			{ "mappingAction", Types.VARCHAR },
			{ "dateOption", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actionConfigId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("actionCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actionName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("extraForm", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("formConfig", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sampleData", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("insideProcess", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("userNote", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("syncType", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("eventType", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("infoType", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("pending", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("rollbackable", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("notificationType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("documentType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mappingAction", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateOption", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_actionconfig (uuid_ VARCHAR(75) null,actionConfigId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,actionCode VARCHAR(75) null,actionName VARCHAR(75) null,extraForm BOOLEAN,formConfig VARCHAR(75) null,sampleData VARCHAR(75) null,insideProcess BOOLEAN,userNote INTEGER,syncType INTEGER,eventType INTEGER,infoType INTEGER,pending BOOLEAN,rollbackable BOOLEAN,notificationType VARCHAR(75) null,documentType VARCHAR(75) null,mappingAction VARCHAR(75) null,dateOption INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table opencps_actionconfig";
	public static final String ORDER_BY_JPQL = " ORDER BY actionConfig.actionCode ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_actionconfig.actionCode ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.dossiermgt.model.ActionConfig"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.dossiermgt.model.ActionConfig"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.dossiermgt.model.ActionConfig"),
			true);
	public static final long ACTIONCODE_COLUMN_BITMASK = 1L;
	public static final long COMPANYID_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.opencps.dossiermgt.model.ActionConfig"));

	public ActionConfigModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _actionConfigId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setActionConfigId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _actionConfigId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ActionConfig.class;
	}

	@Override
	public String getModelClassName() {
		return ActionConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("actionConfigId", getActionConfigId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("actionCode", getActionCode());
		attributes.put("actionName", getActionName());
		attributes.put("extraForm", isExtraForm());
		attributes.put("formConfig", getFormConfig());
		attributes.put("sampleData", getSampleData());
		attributes.put("insideProcess", isInsideProcess());
		attributes.put("userNote", getUserNote());
		attributes.put("syncType", getSyncType());
		attributes.put("eventType", getEventType());
		attributes.put("infoType", getInfoType());
		attributes.put("pending", isPending());
		attributes.put("rollbackable", isRollbackable());
		attributes.put("notificationType", getNotificationType());
		attributes.put("documentType", getDocumentType());
		attributes.put("mappingAction", getMappingAction());
		attributes.put("dateOption", getDateOption());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long actionConfigId = (Long)attributes.get("actionConfigId");

		if (actionConfigId != null) {
			setActionConfigId(actionConfigId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String actionCode = (String)attributes.get("actionCode");

		if (actionCode != null) {
			setActionCode(actionCode);
		}

		String actionName = (String)attributes.get("actionName");

		if (actionName != null) {
			setActionName(actionName);
		}

		Boolean extraForm = (Boolean)attributes.get("extraForm");

		if (extraForm != null) {
			setExtraForm(extraForm);
		}

		String formConfig = (String)attributes.get("formConfig");

		if (formConfig != null) {
			setFormConfig(formConfig);
		}

		String sampleData = (String)attributes.get("sampleData");

		if (sampleData != null) {
			setSampleData(sampleData);
		}

		Boolean insideProcess = (Boolean)attributes.get("insideProcess");

		if (insideProcess != null) {
			setInsideProcess(insideProcess);
		}

		Integer userNote = (Integer)attributes.get("userNote");

		if (userNote != null) {
			setUserNote(userNote);
		}

		Integer syncType = (Integer)attributes.get("syncType");

		if (syncType != null) {
			setSyncType(syncType);
		}

		Integer eventType = (Integer)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		Integer infoType = (Integer)attributes.get("infoType");

		if (infoType != null) {
			setInfoType(infoType);
		}

		Boolean pending = (Boolean)attributes.get("pending");

		if (pending != null) {
			setPending(pending);
		}

		Boolean rollbackable = (Boolean)attributes.get("rollbackable");

		if (rollbackable != null) {
			setRollbackable(rollbackable);
		}

		String notificationType = (String)attributes.get("notificationType");

		if (notificationType != null) {
			setNotificationType(notificationType);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String mappingAction = (String)attributes.get("mappingAction");

		if (mappingAction != null) {
			setMappingAction(mappingAction);
		}

		Integer dateOption = (Integer)attributes.get("dateOption");

		if (dateOption != null) {
			setDateOption(dateOption);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getActionConfigId() {
		return _actionConfigId;
	}

	@Override
	public void setActionConfigId(long actionConfigId) {
		_actionConfigId = actionConfigId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getActionCode() {
		if (_actionCode == null) {
			return "";
		}
		else {
			return _actionCode;
		}
	}

	@Override
	public void setActionCode(String actionCode) {
		_columnBitmask = -1L;

		if (_originalActionCode == null) {
			_originalActionCode = _actionCode;
		}

		_actionCode = actionCode;
	}

	public String getOriginalActionCode() {
		return GetterUtil.getString(_originalActionCode);
	}

	@Override
	public String getActionName() {
		if (_actionName == null) {
			return "";
		}
		else {
			return _actionName;
		}
	}

	@Override
	public void setActionName(String actionName) {
		_actionName = actionName;
	}

	@Override
	public boolean getExtraForm() {
		return _extraForm;
	}

	@Override
	public boolean isExtraForm() {
		return _extraForm;
	}

	@Override
	public void setExtraForm(boolean extraForm) {
		_extraForm = extraForm;
	}

	@Override
	public String getFormConfig() {
		if (_formConfig == null) {
			return "";
		}
		else {
			return _formConfig;
		}
	}

	@Override
	public void setFormConfig(String formConfig) {
		_formConfig = formConfig;
	}

	@Override
	public String getSampleData() {
		if (_sampleData == null) {
			return "";
		}
		else {
			return _sampleData;
		}
	}

	@Override
	public void setSampleData(String sampleData) {
		_sampleData = sampleData;
	}

	@Override
	public boolean getInsideProcess() {
		return _insideProcess;
	}

	@Override
	public boolean isInsideProcess() {
		return _insideProcess;
	}

	@Override
	public void setInsideProcess(boolean insideProcess) {
		_insideProcess = insideProcess;
	}

	@Override
	public int getUserNote() {
		return _userNote;
	}

	@Override
	public void setUserNote(int userNote) {
		_userNote = userNote;
	}

	@Override
	public int getSyncType() {
		return _syncType;
	}

	@Override
	public void setSyncType(int syncType) {
		_syncType = syncType;
	}

	@Override
	public int getEventType() {
		return _eventType;
	}

	@Override
	public void setEventType(int eventType) {
		_eventType = eventType;
	}

	@Override
	public int getInfoType() {
		return _infoType;
	}

	@Override
	public void setInfoType(int infoType) {
		_infoType = infoType;
	}

	@Override
	public boolean getPending() {
		return _pending;
	}

	@Override
	public boolean isPending() {
		return _pending;
	}

	@Override
	public void setPending(boolean pending) {
		_pending = pending;
	}

	@Override
	public boolean getRollbackable() {
		return _rollbackable;
	}

	@Override
	public boolean isRollbackable() {
		return _rollbackable;
	}

	@Override
	public void setRollbackable(boolean rollbackable) {
		_rollbackable = rollbackable;
	}

	@Override
	public String getNotificationType() {
		if (_notificationType == null) {
			return "";
		}
		else {
			return _notificationType;
		}
	}

	@Override
	public void setNotificationType(String notificationType) {
		_notificationType = notificationType;
	}

	@Override
	public String getDocumentType() {
		if (_documentType == null) {
			return "";
		}
		else {
			return _documentType;
		}
	}

	@Override
	public void setDocumentType(String documentType) {
		_documentType = documentType;
	}

	@Override
	public String getMappingAction() {
		if (_mappingAction == null) {
			return "";
		}
		else {
			return _mappingAction;
		}
	}

	@Override
	public void setMappingAction(String mappingAction) {
		_mappingAction = mappingAction;
	}

	@Override
	public int getDateOption() {
		return _dateOption;
	}

	@Override
	public void setDateOption(int dateOption) {
		_dateOption = dateOption;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				ActionConfig.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ActionConfig.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ActionConfig toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ActionConfig)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ActionConfigImpl actionConfigImpl = new ActionConfigImpl();

		actionConfigImpl.setUuid(getUuid());
		actionConfigImpl.setActionConfigId(getActionConfigId());
		actionConfigImpl.setCompanyId(getCompanyId());
		actionConfigImpl.setGroupId(getGroupId());
		actionConfigImpl.setUserId(getUserId());
		actionConfigImpl.setCreateDate(getCreateDate());
		actionConfigImpl.setModifiedDate(getModifiedDate());
		actionConfigImpl.setActionCode(getActionCode());
		actionConfigImpl.setActionName(getActionName());
		actionConfigImpl.setExtraForm(isExtraForm());
		actionConfigImpl.setFormConfig(getFormConfig());
		actionConfigImpl.setSampleData(getSampleData());
		actionConfigImpl.setInsideProcess(isInsideProcess());
		actionConfigImpl.setUserNote(getUserNote());
		actionConfigImpl.setSyncType(getSyncType());
		actionConfigImpl.setEventType(getEventType());
		actionConfigImpl.setInfoType(getInfoType());
		actionConfigImpl.setPending(isPending());
		actionConfigImpl.setRollbackable(isRollbackable());
		actionConfigImpl.setNotificationType(getNotificationType());
		actionConfigImpl.setDocumentType(getDocumentType());
		actionConfigImpl.setMappingAction(getMappingAction());
		actionConfigImpl.setDateOption(getDateOption());

		actionConfigImpl.resetOriginalValues();

		return actionConfigImpl;
	}

	@Override
	public int compareTo(ActionConfig actionConfig) {
		int value = 0;

		value = getActionCode().compareTo(actionConfig.getActionCode());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActionConfig)) {
			return false;
		}

		ActionConfig actionConfig = (ActionConfig)obj;

		long primaryKey = actionConfig.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ActionConfigModelImpl actionConfigModelImpl = this;

		actionConfigModelImpl._originalUuid = actionConfigModelImpl._uuid;

		actionConfigModelImpl._originalCompanyId = actionConfigModelImpl._companyId;

		actionConfigModelImpl._setOriginalCompanyId = false;

		actionConfigModelImpl._originalGroupId = actionConfigModelImpl._groupId;

		actionConfigModelImpl._setOriginalGroupId = false;

		actionConfigModelImpl._setModifiedDate = false;

		actionConfigModelImpl._originalActionCode = actionConfigModelImpl._actionCode;

		actionConfigModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ActionConfig> toCacheModel() {
		ActionConfigCacheModel actionConfigCacheModel = new ActionConfigCacheModel();

		actionConfigCacheModel.uuid = getUuid();

		String uuid = actionConfigCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			actionConfigCacheModel.uuid = null;
		}

		actionConfigCacheModel.actionConfigId = getActionConfigId();

		actionConfigCacheModel.companyId = getCompanyId();

		actionConfigCacheModel.groupId = getGroupId();

		actionConfigCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			actionConfigCacheModel.createDate = createDate.getTime();
		}
		else {
			actionConfigCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			actionConfigCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			actionConfigCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		actionConfigCacheModel.actionCode = getActionCode();

		String actionCode = actionConfigCacheModel.actionCode;

		if ((actionCode != null) && (actionCode.length() == 0)) {
			actionConfigCacheModel.actionCode = null;
		}

		actionConfigCacheModel.actionName = getActionName();

		String actionName = actionConfigCacheModel.actionName;

		if ((actionName != null) && (actionName.length() == 0)) {
			actionConfigCacheModel.actionName = null;
		}

		actionConfigCacheModel.extraForm = isExtraForm();

		actionConfigCacheModel.formConfig = getFormConfig();

		String formConfig = actionConfigCacheModel.formConfig;

		if ((formConfig != null) && (formConfig.length() == 0)) {
			actionConfigCacheModel.formConfig = null;
		}

		actionConfigCacheModel.sampleData = getSampleData();

		String sampleData = actionConfigCacheModel.sampleData;

		if ((sampleData != null) && (sampleData.length() == 0)) {
			actionConfigCacheModel.sampleData = null;
		}

		actionConfigCacheModel.insideProcess = isInsideProcess();

		actionConfigCacheModel.userNote = getUserNote();

		actionConfigCacheModel.syncType = getSyncType();

		actionConfigCacheModel.eventType = getEventType();

		actionConfigCacheModel.infoType = getInfoType();

		actionConfigCacheModel.pending = isPending();

		actionConfigCacheModel.rollbackable = isRollbackable();

		actionConfigCacheModel.notificationType = getNotificationType();

		String notificationType = actionConfigCacheModel.notificationType;

		if ((notificationType != null) && (notificationType.length() == 0)) {
			actionConfigCacheModel.notificationType = null;
		}

		actionConfigCacheModel.documentType = getDocumentType();

		String documentType = actionConfigCacheModel.documentType;

		if ((documentType != null) && (documentType.length() == 0)) {
			actionConfigCacheModel.documentType = null;
		}

		actionConfigCacheModel.mappingAction = getMappingAction();

		String mappingAction = actionConfigCacheModel.mappingAction;

		if ((mappingAction != null) && (mappingAction.length() == 0)) {
			actionConfigCacheModel.mappingAction = null;
		}

		actionConfigCacheModel.dateOption = getDateOption();

		return actionConfigCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", actionConfigId=");
		sb.append(getActionConfigId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", actionCode=");
		sb.append(getActionCode());
		sb.append(", actionName=");
		sb.append(getActionName());
		sb.append(", extraForm=");
		sb.append(isExtraForm());
		sb.append(", formConfig=");
		sb.append(getFormConfig());
		sb.append(", sampleData=");
		sb.append(getSampleData());
		sb.append(", insideProcess=");
		sb.append(isInsideProcess());
		sb.append(", userNote=");
		sb.append(getUserNote());
		sb.append(", syncType=");
		sb.append(getSyncType());
		sb.append(", eventType=");
		sb.append(getEventType());
		sb.append(", infoType=");
		sb.append(getInfoType());
		sb.append(", pending=");
		sb.append(isPending());
		sb.append(", rollbackable=");
		sb.append(isRollbackable());
		sb.append(", notificationType=");
		sb.append(getNotificationType());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", mappingAction=");
		sb.append(getMappingAction());
		sb.append(", dateOption=");
		sb.append(getDateOption());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.ActionConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionConfigId</column-name><column-value><![CDATA[");
		sb.append(getActionConfigId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionCode</column-name><column-value><![CDATA[");
		sb.append(getActionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionName</column-name><column-value><![CDATA[");
		sb.append(getActionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extraForm</column-name><column-value><![CDATA[");
		sb.append(isExtraForm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formConfig</column-name><column-value><![CDATA[");
		sb.append(getFormConfig());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sampleData</column-name><column-value><![CDATA[");
		sb.append(getSampleData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insideProcess</column-name><column-value><![CDATA[");
		sb.append(isInsideProcess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userNote</column-name><column-value><![CDATA[");
		sb.append(getUserNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncType</column-name><column-value><![CDATA[");
		sb.append(getSyncType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventType</column-name><column-value><![CDATA[");
		sb.append(getEventType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoType</column-name><column-value><![CDATA[");
		sb.append(getInfoType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pending</column-name><column-value><![CDATA[");
		sb.append(isPending());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rollbackable</column-name><column-value><![CDATA[");
		sb.append(isRollbackable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notificationType</column-name><column-value><![CDATA[");
		sb.append(getNotificationType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mappingAction</column-name><column-value><![CDATA[");
		sb.append(getMappingAction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOption</column-name><column-value><![CDATA[");
		sb.append(getDateOption());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ActionConfig.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ActionConfig.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _actionConfigId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _actionCode;
	private String _originalActionCode;
	private String _actionName;
	private boolean _extraForm;
	private String _formConfig;
	private String _sampleData;
	private boolean _insideProcess;
	private int _userNote;
	private int _syncType;
	private int _eventType;
	private int _infoType;
	private boolean _pending;
	private boolean _rollbackable;
	private String _notificationType;
	private String _documentType;
	private String _mappingAction;
	private int _dateOption;
	private long _columnBitmask;
	private ActionConfig _escapedModel;
}