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

package org.opencps.deliverable.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.deliverable.model.OpenCPSDeliverable;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for OpenCPSDeliverable. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author binhth
 * @see OpenCPSDeliverableLocalServiceUtil
 * @see org.opencps.deliverable.service.base.OpenCPSDeliverableLocalServiceBaseImpl
 * @see org.opencps.deliverable.service.impl.OpenCPSDeliverableLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface OpenCPSDeliverableLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OpenCPSDeliverableLocalServiceUtil} to access the open cps deliverable local service. Add custom service methods to {@link org.opencps.deliverable.service.impl.OpenCPSDeliverableLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the open cps deliverable to the database. Also notifies the appropriate model listeners.
	*
	* @param openCPSDeliverable the open cps deliverable
	* @return the open cps deliverable that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public OpenCPSDeliverable addOpenCPSDeliverable(
		OpenCPSDeliverable openCPSDeliverable);

	@Indexable(type = IndexableType.REINDEX)
	public OpenCPSDeliverable adminProcessData(JSONObject objectData);

	@Indexable(type = IndexableType.DELETE)
	public OpenCPSDeliverable adminProcessDelete(Long id);

	/**
	* Creates a new open cps deliverable with the primary key. Does not add the open cps deliverable to the database.
	*
	* @param deliverableId the primary key for the new open cps deliverable
	* @return the new open cps deliverable
	*/
	@Transactional(enabled = false)
	public OpenCPSDeliverable createOpenCPSDeliverable(long deliverableId);

	/**
	* Deletes the open cps deliverable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverableId the primary key of the open cps deliverable
	* @return the open cps deliverable that was removed
	* @throws PortalException if a open cps deliverable with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public OpenCPSDeliverable deleteOpenCPSDeliverable(long deliverableId)
		throws PortalException;

	/**
	* Deletes the open cps deliverable from the database. Also notifies the appropriate model listeners.
	*
	* @param openCPSDeliverable the open cps deliverable
	* @return the open cps deliverable that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public OpenCPSDeliverable deleteOpenCPSDeliverable(
		OpenCPSDeliverable openCPSDeliverable);

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.deliverable.model.impl.OpenCPSDeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.deliverable.model.impl.OpenCPSDeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OpenCPSDeliverable fetchOpenCPSDeliverable(long deliverableId);

	/**
	* Returns the open cps deliverable matching the UUID and group.
	*
	* @param uuid the open cps deliverable's UUID
	* @param groupId the primary key of the group
	* @return the matching open cps deliverable, or <code>null</code> if a matching open cps deliverable could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OpenCPSDeliverable fetchOpenCPSDeliverableByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the open cps deliverable with the primary key.
	*
	* @param deliverableId the primary key of the open cps deliverable
	* @return the open cps deliverable
	* @throws PortalException if a open cps deliverable with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OpenCPSDeliverable getOpenCPSDeliverable(long deliverableId)
		throws PortalException;

	/**
	* Returns the open cps deliverable matching the UUID and group.
	*
	* @param uuid the open cps deliverable's UUID
	* @param groupId the primary key of the group
	* @return the matching open cps deliverable
	* @throws PortalException if a matching open cps deliverable could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OpenCPSDeliverable getOpenCPSDeliverableByUuidAndGroupId(
		String uuid, long groupId) throws PortalException;

	/**
	* Returns a range of all the open cps deliverables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.deliverable.model.impl.OpenCPSDeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of open cps deliverables
	* @param end the upper bound of the range of open cps deliverables (not inclusive)
	* @return the range of open cps deliverables
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OpenCPSDeliverable> getOpenCPSDeliverables(int start, int end);

	/**
	* Returns all the open cps deliverables matching the UUID and company.
	*
	* @param uuid the UUID of the open cps deliverables
	* @param companyId the primary key of the company
	* @return the matching open cps deliverables, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OpenCPSDeliverable> getOpenCPSDeliverablesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	* Returns a range of open cps deliverables matching the UUID and company.
	*
	* @param uuid the UUID of the open cps deliverables
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of open cps deliverables
	* @param end the upper bound of the range of open cps deliverables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching open cps deliverables, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OpenCPSDeliverable> getOpenCPSDeliverablesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OpenCPSDeliverable> orderByComparator);

	/**
	* Returns the number of open cps deliverables.
	*
	* @return the number of open cps deliverables
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getOpenCPSDeliverablesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the open cps deliverable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param openCPSDeliverable the open cps deliverable
	* @return the open cps deliverable that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public OpenCPSDeliverable updateOpenCPSDeliverable(
		OpenCPSDeliverable openCPSDeliverable);
}