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

package org.opencps.usermgt.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for SyncScheduler. This utility wraps
 * {@link org.opencps.usermgt.service.impl.SyncSchedulerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoavu
 * @see SyncSchedulerLocalService
 * @see org.opencps.usermgt.service.base.SyncSchedulerLocalServiceBaseImpl
 * @see org.opencps.usermgt.service.impl.SyncSchedulerLocalServiceImpl
 * @generated
 */
@ProviderType
public class SyncSchedulerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.usermgt.service.impl.SyncSchedulerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the sync scheduler to the database. Also notifies the appropriate model listeners.
	*
	* @param syncScheduler the sync scheduler
	* @return the sync scheduler that was added
	*/
	public static org.opencps.usermgt.model.SyncScheduler addSyncScheduler(
		org.opencps.usermgt.model.SyncScheduler syncScheduler) {
		return getService().addSyncScheduler(syncScheduler);
	}

	/**
	* Creates a new sync scheduler with the primary key. Does not add the sync scheduler to the database.
	*
	* @param syncSchedulerId the primary key for the new sync scheduler
	* @return the new sync scheduler
	*/
	public static org.opencps.usermgt.model.SyncScheduler createSyncScheduler(
		long syncSchedulerId) {
		return getService().createSyncScheduler(syncSchedulerId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the sync scheduler with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param syncSchedulerId the primary key of the sync scheduler
	* @return the sync scheduler that was removed
	* @throws PortalException if a sync scheduler with the primary key could not be found
	*/
	public static org.opencps.usermgt.model.SyncScheduler deleteSyncScheduler(
		long syncSchedulerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSyncScheduler(syncSchedulerId);
	}

	/**
	* Deletes the sync scheduler from the database. Also notifies the appropriate model listeners.
	*
	* @param syncScheduler the sync scheduler
	* @return the sync scheduler that was removed
	*/
	public static org.opencps.usermgt.model.SyncScheduler deleteSyncScheduler(
		org.opencps.usermgt.model.SyncScheduler syncScheduler) {
		return getService().deleteSyncScheduler(syncScheduler);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.SyncSchedulerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.SyncSchedulerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.opencps.usermgt.model.SyncScheduler fetchSyncScheduler(
		long syncSchedulerId) {
		return getService().fetchSyncScheduler(syncSchedulerId);
	}

	/**
	* Returns the sync scheduler matching the UUID and group.
	*
	* @param uuid the sync scheduler's UUID
	* @param groupId the primary key of the group
	* @return the matching sync scheduler, or <code>null</code> if a matching sync scheduler could not be found
	*/
	public static org.opencps.usermgt.model.SyncScheduler fetchSyncSchedulerByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchSyncSchedulerByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static org.opencps.usermgt.model.SyncScheduler getByClassNameAndSyncDate(
		String className, java.util.Date syncDate) {
		return getService().getByClassNameAndSyncDate(className, syncDate);
	}

	public static org.opencps.usermgt.model.SyncScheduler getByClassNameAndTypeCode(
		String className, String typeCode) {
		return getService().getByClassNameAndTypeCode(className, typeCode);
	}

	public static java.util.List<org.opencps.usermgt.model.SyncScheduler> getByF_NAME_RETRY(
		String className, int retry) {
		return getService().getByF_NAME_RETRY(className, retry);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the sync scheduler with the primary key.
	*
	* @param syncSchedulerId the primary key of the sync scheduler
	* @return the sync scheduler
	* @throws PortalException if a sync scheduler with the primary key could not be found
	*/
	public static org.opencps.usermgt.model.SyncScheduler getSyncScheduler(
		long syncSchedulerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSyncScheduler(syncSchedulerId);
	}

	/**
	* Returns the sync scheduler matching the UUID and group.
	*
	* @param uuid the sync scheduler's UUID
	* @param groupId the primary key of the group
	* @return the matching sync scheduler
	* @throws PortalException if a matching sync scheduler could not be found
	*/
	public static org.opencps.usermgt.model.SyncScheduler getSyncSchedulerByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSyncSchedulerByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the sync schedulers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.SyncSchedulerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sync schedulers
	* @param end the upper bound of the range of sync schedulers (not inclusive)
	* @return the range of sync schedulers
	*/
	public static java.util.List<org.opencps.usermgt.model.SyncScheduler> getSyncSchedulers(
		int start, int end) {
		return getService().getSyncSchedulers(start, end);
	}

	/**
	* Returns the number of sync schedulers.
	*
	* @return the number of sync schedulers
	*/
	public static int getSyncSchedulersCount() {
		return getService().getSyncSchedulersCount();
	}

	public static org.opencps.usermgt.model.SyncScheduler updateSyncScheduler(
		long syncSchedulerId, long groupId, String className, String typeCode,
		java.util.Date syncDate, int retry,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .updateSyncScheduler(syncSchedulerId, groupId, className,
			typeCode, syncDate, retry, serviceContext);
	}

	/**
	* Updates the sync scheduler in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param syncScheduler the sync scheduler
	* @return the sync scheduler that was updated
	*/
	public static org.opencps.usermgt.model.SyncScheduler updateSyncScheduler(
		org.opencps.usermgt.model.SyncScheduler syncScheduler) {
		return getService().updateSyncScheduler(syncScheduler);
	}

	public static SyncSchedulerLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SyncSchedulerLocalService, SyncSchedulerLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SyncSchedulerLocalService.class);

		ServiceTracker<SyncSchedulerLocalService, SyncSchedulerLocalService> serviceTracker =
			new ServiceTracker<SyncSchedulerLocalService, SyncSchedulerLocalService>(bundle.getBundleContext(),
				SyncSchedulerLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}