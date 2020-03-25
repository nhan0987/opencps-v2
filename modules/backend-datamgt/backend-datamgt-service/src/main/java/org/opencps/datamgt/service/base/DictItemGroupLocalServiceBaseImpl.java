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

package org.opencps.datamgt.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import org.opencps.datamgt.model.DictItemGroup;
import org.opencps.datamgt.service.DictItemGroupLocalService;
import org.opencps.datamgt.service.persistence.DictCollectionPersistence;
import org.opencps.datamgt.service.persistence.DictGroupPersistence;
import org.opencps.datamgt.service.persistence.DictItemGroupPersistence;
import org.opencps.datamgt.service.persistence.DictItemPersistence;
import org.opencps.datamgt.service.persistence.FileAttachPersistence;
import org.opencps.datamgt.service.persistence.HolidayPersistence;
import org.opencps.datamgt.service.persistence.WorkTimePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dict item group local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.datamgt.service.impl.DictItemGroupLocalServiceImpl}.
 * </p>
 *
 * @author khoavu
 * @see org.opencps.datamgt.service.impl.DictItemGroupLocalServiceImpl
 * @see org.opencps.datamgt.service.DictItemGroupLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class DictItemGroupLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements DictItemGroupLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.datamgt.service.DictItemGroupLocalServiceUtil} to access the dict item group local service.
	 */

	/**
	 * Adds the dict item group to the database. Also notifies the appropriate model listeners.
	 *
	 * @param dictItemGroup the dict item group
	 * @return the dict item group that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DictItemGroup addDictItemGroup(DictItemGroup dictItemGroup) {
		dictItemGroup.setNew(true);

		return dictItemGroupPersistence.update(dictItemGroup);
	}

	/**
	 * Creates a new dict item group with the primary key. Does not add the dict item group to the database.
	 *
	 * @param dictItemGroupId the primary key for the new dict item group
	 * @return the new dict item group
	 */
	@Override
	@Transactional(enabled = false)
	public DictItemGroup createDictItemGroup(long dictItemGroupId) {
		return dictItemGroupPersistence.create(dictItemGroupId);
	}

	/**
	 * Deletes the dict item group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dictItemGroupId the primary key of the dict item group
	 * @return the dict item group that was removed
	 * @throws PortalException if a dict item group with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DictItemGroup deleteDictItemGroup(long dictItemGroupId)
		throws PortalException {
		return dictItemGroupPersistence.remove(dictItemGroupId);
	}

	/**
	 * Deletes the dict item group from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dictItemGroup the dict item group
	 * @return the dict item group that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DictItemGroup deleteDictItemGroup(DictItemGroup dictItemGroup) {
		return dictItemGroupPersistence.remove(dictItemGroup);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(DictItemGroup.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return dictItemGroupPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictItemGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return dictItemGroupPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictItemGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return dictItemGroupPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return dictItemGroupPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return dictItemGroupPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public DictItemGroup fetchDictItemGroup(long dictItemGroupId) {
		return dictItemGroupPersistence.fetchByPrimaryKey(dictItemGroupId);
	}

	/**
	 * Returns the dict item group matching the UUID and group.
	 *
	 * @param uuid the dict item group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dict item group, or <code>null</code> if a matching dict item group could not be found
	 */
	@Override
	public DictItemGroup fetchDictItemGroupByUuidAndGroupId(String uuid,
		long groupId) {
		return dictItemGroupPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dict item group with the primary key.
	 *
	 * @param dictItemGroupId the primary key of the dict item group
	 * @return the dict item group
	 * @throws PortalException if a dict item group with the primary key could not be found
	 */
	@Override
	public DictItemGroup getDictItemGroup(long dictItemGroupId)
		throws PortalException {
		return dictItemGroupPersistence.findByPrimaryKey(dictItemGroupId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(dictItemGroupLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DictItemGroup.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("dictItemGroupId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(dictItemGroupLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(DictItemGroup.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"dictItemGroupId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(dictItemGroupLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DictItemGroup.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("dictItemGroupId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {
		final ExportActionableDynamicQuery exportActionableDynamicQuery = new ExportActionableDynamicQuery() {
				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(stagedModelType,
						modelAdditionCount);

					long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(portletDataContext,
							stagedModelType);

					manifestSummary.addModelDeletionCount(stagedModelType,
						modelDeletionCount);

					return modelAdditionCount;
				}
			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(dynamicQuery,
						"modifiedDate");
				}
			});

		exportActionableDynamicQuery.setCompanyId(portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<DictItemGroup>() {
				@Override
				public void performAction(DictItemGroup dictItemGroup)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						dictItemGroup);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(DictItemGroup.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return dictItemGroupLocalService.deleteDictItemGroup((DictItemGroup)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return dictItemGroupPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the dict item groups matching the UUID and company.
	 *
	 * @param uuid the UUID of the dict item groups
	 * @param companyId the primary key of the company
	 * @return the matching dict item groups, or an empty list if no matches were found
	 */
	@Override
	public List<DictItemGroup> getDictItemGroupsByUuidAndCompanyId(
		String uuid, long companyId) {
		return dictItemGroupPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of dict item groups matching the UUID and company.
	 *
	 * @param uuid the UUID of the dict item groups
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of dict item groups
	 * @param end the upper bound of the range of dict item groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching dict item groups, or an empty list if no matches were found
	 */
	@Override
	public List<DictItemGroup> getDictItemGroupsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DictItemGroup> orderByComparator) {
		return dictItemGroupPersistence.findByUuid_C(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	 * Returns the dict item group matching the UUID and group.
	 *
	 * @param uuid the dict item group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dict item group
	 * @throws PortalException if a matching dict item group could not be found
	 */
	@Override
	public DictItemGroup getDictItemGroupByUuidAndGroupId(String uuid,
		long groupId) throws PortalException {
		return dictItemGroupPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the dict item groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictItemGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dict item groups
	 * @param end the upper bound of the range of dict item groups (not inclusive)
	 * @return the range of dict item groups
	 */
	@Override
	public List<DictItemGroup> getDictItemGroups(int start, int end) {
		return dictItemGroupPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of dict item groups.
	 *
	 * @return the number of dict item groups
	 */
	@Override
	public int getDictItemGroupsCount() {
		return dictItemGroupPersistence.countAll();
	}

	/**
	 * Updates the dict item group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param dictItemGroup the dict item group
	 * @return the dict item group that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DictItemGroup updateDictItemGroup(DictItemGroup dictItemGroup) {
		return dictItemGroupPersistence.update(dictItemGroup);
	}

	/**
	 * Returns the dict collection local service.
	 *
	 * @return the dict collection local service
	 */
	public org.opencps.datamgt.service.DictCollectionLocalService getDictCollectionLocalService() {
		return dictCollectionLocalService;
	}

	/**
	 * Sets the dict collection local service.
	 *
	 * @param dictCollectionLocalService the dict collection local service
	 */
	public void setDictCollectionLocalService(
		org.opencps.datamgt.service.DictCollectionLocalService dictCollectionLocalService) {
		this.dictCollectionLocalService = dictCollectionLocalService;
	}

	/**
	 * Returns the dict collection persistence.
	 *
	 * @return the dict collection persistence
	 */
	public DictCollectionPersistence getDictCollectionPersistence() {
		return dictCollectionPersistence;
	}

	/**
	 * Sets the dict collection persistence.
	 *
	 * @param dictCollectionPersistence the dict collection persistence
	 */
	public void setDictCollectionPersistence(
		DictCollectionPersistence dictCollectionPersistence) {
		this.dictCollectionPersistence = dictCollectionPersistence;
	}

	/**
	 * Returns the dict group local service.
	 *
	 * @return the dict group local service
	 */
	public org.opencps.datamgt.service.DictGroupLocalService getDictGroupLocalService() {
		return dictGroupLocalService;
	}

	/**
	 * Sets the dict group local service.
	 *
	 * @param dictGroupLocalService the dict group local service
	 */
	public void setDictGroupLocalService(
		org.opencps.datamgt.service.DictGroupLocalService dictGroupLocalService) {
		this.dictGroupLocalService = dictGroupLocalService;
	}

	/**
	 * Returns the dict group persistence.
	 *
	 * @return the dict group persistence
	 */
	public DictGroupPersistence getDictGroupPersistence() {
		return dictGroupPersistence;
	}

	/**
	 * Sets the dict group persistence.
	 *
	 * @param dictGroupPersistence the dict group persistence
	 */
	public void setDictGroupPersistence(
		DictGroupPersistence dictGroupPersistence) {
		this.dictGroupPersistence = dictGroupPersistence;
	}

	/**
	 * Returns the dict item local service.
	 *
	 * @return the dict item local service
	 */
	public org.opencps.datamgt.service.DictItemLocalService getDictItemLocalService() {
		return dictItemLocalService;
	}

	/**
	 * Sets the dict item local service.
	 *
	 * @param dictItemLocalService the dict item local service
	 */
	public void setDictItemLocalService(
		org.opencps.datamgt.service.DictItemLocalService dictItemLocalService) {
		this.dictItemLocalService = dictItemLocalService;
	}

	/**
	 * Returns the dict item persistence.
	 *
	 * @return the dict item persistence
	 */
	public DictItemPersistence getDictItemPersistence() {
		return dictItemPersistence;
	}

	/**
	 * Sets the dict item persistence.
	 *
	 * @param dictItemPersistence the dict item persistence
	 */
	public void setDictItemPersistence(DictItemPersistence dictItemPersistence) {
		this.dictItemPersistence = dictItemPersistence;
	}

	/**
	 * Returns the dict item group local service.
	 *
	 * @return the dict item group local service
	 */
	public DictItemGroupLocalService getDictItemGroupLocalService() {
		return dictItemGroupLocalService;
	}

	/**
	 * Sets the dict item group local service.
	 *
	 * @param dictItemGroupLocalService the dict item group local service
	 */
	public void setDictItemGroupLocalService(
		DictItemGroupLocalService dictItemGroupLocalService) {
		this.dictItemGroupLocalService = dictItemGroupLocalService;
	}

	/**
	 * Returns the dict item group persistence.
	 *
	 * @return the dict item group persistence
	 */
	public DictItemGroupPersistence getDictItemGroupPersistence() {
		return dictItemGroupPersistence;
	}

	/**
	 * Sets the dict item group persistence.
	 *
	 * @param dictItemGroupPersistence the dict item group persistence
	 */
	public void setDictItemGroupPersistence(
		DictItemGroupPersistence dictItemGroupPersistence) {
		this.dictItemGroupPersistence = dictItemGroupPersistence;
	}

	/**
	 * Returns the file attach local service.
	 *
	 * @return the file attach local service
	 */
	public org.opencps.datamgt.service.FileAttachLocalService getFileAttachLocalService() {
		return fileAttachLocalService;
	}

	/**
	 * Sets the file attach local service.
	 *
	 * @param fileAttachLocalService the file attach local service
	 */
	public void setFileAttachLocalService(
		org.opencps.datamgt.service.FileAttachLocalService fileAttachLocalService) {
		this.fileAttachLocalService = fileAttachLocalService;
	}

	/**
	 * Returns the file attach persistence.
	 *
	 * @return the file attach persistence
	 */
	public FileAttachPersistence getFileAttachPersistence() {
		return fileAttachPersistence;
	}

	/**
	 * Sets the file attach persistence.
	 *
	 * @param fileAttachPersistence the file attach persistence
	 */
	public void setFileAttachPersistence(
		FileAttachPersistence fileAttachPersistence) {
		this.fileAttachPersistence = fileAttachPersistence;
	}

	/**
	 * Returns the holiday local service.
	 *
	 * @return the holiday local service
	 */
	public org.opencps.datamgt.service.HolidayLocalService getHolidayLocalService() {
		return holidayLocalService;
	}

	/**
	 * Sets the holiday local service.
	 *
	 * @param holidayLocalService the holiday local service
	 */
	public void setHolidayLocalService(
		org.opencps.datamgt.service.HolidayLocalService holidayLocalService) {
		this.holidayLocalService = holidayLocalService;
	}

	/**
	 * Returns the holiday persistence.
	 *
	 * @return the holiday persistence
	 */
	public HolidayPersistence getHolidayPersistence() {
		return holidayPersistence;
	}

	/**
	 * Sets the holiday persistence.
	 *
	 * @param holidayPersistence the holiday persistence
	 */
	public void setHolidayPersistence(HolidayPersistence holidayPersistence) {
		this.holidayPersistence = holidayPersistence;
	}

	/**
	 * Returns the work time local service.
	 *
	 * @return the work time local service
	 */
	public org.opencps.datamgt.service.WorkTimeLocalService getWorkTimeLocalService() {
		return workTimeLocalService;
	}

	/**
	 * Sets the work time local service.
	 *
	 * @param workTimeLocalService the work time local service
	 */
	public void setWorkTimeLocalService(
		org.opencps.datamgt.service.WorkTimeLocalService workTimeLocalService) {
		this.workTimeLocalService = workTimeLocalService;
	}

	/**
	 * Returns the work time persistence.
	 *
	 * @return the work time persistence
	 */
	public WorkTimePersistence getWorkTimePersistence() {
		return workTimePersistence;
	}

	/**
	 * Sets the work time persistence.
	 *
	 * @param workTimePersistence the work time persistence
	 */
	public void setWorkTimePersistence(WorkTimePersistence workTimePersistence) {
		this.workTimePersistence = workTimePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("org.opencps.datamgt.model.DictItemGroup",
			dictItemGroupLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"org.opencps.datamgt.model.DictItemGroup");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DictItemGroupLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return DictItemGroup.class;
	}

	protected String getModelClassName() {
		return DictItemGroup.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = dictItemGroupPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.datamgt.service.DictCollectionLocalService.class)
	protected org.opencps.datamgt.service.DictCollectionLocalService dictCollectionLocalService;
	@BeanReference(type = DictCollectionPersistence.class)
	protected DictCollectionPersistence dictCollectionPersistence;
	@BeanReference(type = org.opencps.datamgt.service.DictGroupLocalService.class)
	protected org.opencps.datamgt.service.DictGroupLocalService dictGroupLocalService;
	@BeanReference(type = DictGroupPersistence.class)
	protected DictGroupPersistence dictGroupPersistence;
	@BeanReference(type = org.opencps.datamgt.service.DictItemLocalService.class)
	protected org.opencps.datamgt.service.DictItemLocalService dictItemLocalService;
	@BeanReference(type = DictItemPersistence.class)
	protected DictItemPersistence dictItemPersistence;
	@BeanReference(type = DictItemGroupLocalService.class)
	protected DictItemGroupLocalService dictItemGroupLocalService;
	@BeanReference(type = DictItemGroupPersistence.class)
	protected DictItemGroupPersistence dictItemGroupPersistence;
	@BeanReference(type = org.opencps.datamgt.service.FileAttachLocalService.class)
	protected org.opencps.datamgt.service.FileAttachLocalService fileAttachLocalService;
	@BeanReference(type = FileAttachPersistence.class)
	protected FileAttachPersistence fileAttachPersistence;
	@BeanReference(type = org.opencps.datamgt.service.HolidayLocalService.class)
	protected org.opencps.datamgt.service.HolidayLocalService holidayLocalService;
	@BeanReference(type = HolidayPersistence.class)
	protected HolidayPersistence holidayPersistence;
	@BeanReference(type = org.opencps.datamgt.service.WorkTimeLocalService.class)
	protected org.opencps.datamgt.service.WorkTimeLocalService workTimeLocalService;
	@BeanReference(type = WorkTimePersistence.class)
	protected WorkTimePersistence workTimePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}