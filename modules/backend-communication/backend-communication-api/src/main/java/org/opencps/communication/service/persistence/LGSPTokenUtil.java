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

package org.opencps.communication.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.communication.model.LGSPToken;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the lgsp token service. This utility wraps {@link org.opencps.communication.service.persistence.impl.LGSPTokenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoavd
 * @see LGSPTokenPersistence
 * @see org.opencps.communication.service.persistence.impl.LGSPTokenPersistenceImpl
 * @generated
 */
@ProviderType
public class LGSPTokenUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(LGSPToken lgspToken) {
		getPersistence().clearCache(lgspToken);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LGSPToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LGSPToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LGSPToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LGSPToken> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LGSPToken update(LGSPToken lgspToken) {
		return getPersistence().update(lgspToken);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LGSPToken update(LGSPToken lgspToken,
		ServiceContext serviceContext) {
		return getPersistence().update(lgspToken, serviceContext);
	}

	/**
	* Returns all the lgsp tokens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching lgsp tokens
	*/
	public static List<LGSPToken> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the lgsp tokens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @return the range of matching lgsp tokens
	*/
	public static List<LGSPToken> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the lgsp tokens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lgsp tokens
	*/
	public static List<LGSPToken> findByUuid(String uuid, int start, int end,
		OrderByComparator<LGSPToken> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lgsp tokens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lgsp tokens
	*/
	public static List<LGSPToken> findByUuid(String uuid, int start, int end,
		OrderByComparator<LGSPToken> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lgsp token in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lgsp token
	* @throws NoSuchLGSPTokenException if a matching lgsp token could not be found
	*/
	public static LGSPToken findByUuid_First(String uuid,
		OrderByComparator<LGSPToken> orderByComparator)
		throws org.opencps.communication.exception.NoSuchLGSPTokenException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first lgsp token in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lgsp token, or <code>null</code> if a matching lgsp token could not be found
	*/
	public static LGSPToken fetchByUuid_First(String uuid,
		OrderByComparator<LGSPToken> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last lgsp token in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lgsp token
	* @throws NoSuchLGSPTokenException if a matching lgsp token could not be found
	*/
	public static LGSPToken findByUuid_Last(String uuid,
		OrderByComparator<LGSPToken> orderByComparator)
		throws org.opencps.communication.exception.NoSuchLGSPTokenException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last lgsp token in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lgsp token, or <code>null</code> if a matching lgsp token could not be found
	*/
	public static LGSPToken fetchByUuid_Last(String uuid,
		OrderByComparator<LGSPToken> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the lgsp tokens before and after the current lgsp token in the ordered set where uuid = &#63;.
	*
	* @param tokenId the primary key of the current lgsp token
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lgsp token
	* @throws NoSuchLGSPTokenException if a lgsp token with the primary key could not be found
	*/
	public static LGSPToken[] findByUuid_PrevAndNext(long tokenId, String uuid,
		OrderByComparator<LGSPToken> orderByComparator)
		throws org.opencps.communication.exception.NoSuchLGSPTokenException {
		return getPersistence()
				   .findByUuid_PrevAndNext(tokenId, uuid, orderByComparator);
	}

	/**
	* Removes all the lgsp tokens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of lgsp tokens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching lgsp tokens
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the lgsp tokens where tokenType = &#63;.
	*
	* @param tokenType the token type
	* @return the matching lgsp tokens
	*/
	public static List<LGSPToken> findByF_TYPE_EXPIRY(String tokenType) {
		return getPersistence().findByF_TYPE_EXPIRY(tokenType);
	}

	/**
	* Returns a range of all the lgsp tokens where tokenType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tokenType the token type
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @return the range of matching lgsp tokens
	*/
	public static List<LGSPToken> findByF_TYPE_EXPIRY(String tokenType,
		int start, int end) {
		return getPersistence().findByF_TYPE_EXPIRY(tokenType, start, end);
	}

	/**
	* Returns an ordered range of all the lgsp tokens where tokenType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tokenType the token type
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lgsp tokens
	*/
	public static List<LGSPToken> findByF_TYPE_EXPIRY(String tokenType,
		int start, int end, OrderByComparator<LGSPToken> orderByComparator) {
		return getPersistence()
				   .findByF_TYPE_EXPIRY(tokenType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lgsp tokens where tokenType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tokenType the token type
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lgsp tokens
	*/
	public static List<LGSPToken> findByF_TYPE_EXPIRY(String tokenType,
		int start, int end, OrderByComparator<LGSPToken> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_TYPE_EXPIRY(tokenType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first lgsp token in the ordered set where tokenType = &#63;.
	*
	* @param tokenType the token type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lgsp token
	* @throws NoSuchLGSPTokenException if a matching lgsp token could not be found
	*/
	public static LGSPToken findByF_TYPE_EXPIRY_First(String tokenType,
		OrderByComparator<LGSPToken> orderByComparator)
		throws org.opencps.communication.exception.NoSuchLGSPTokenException {
		return getPersistence()
				   .findByF_TYPE_EXPIRY_First(tokenType, orderByComparator);
	}

	/**
	* Returns the first lgsp token in the ordered set where tokenType = &#63;.
	*
	* @param tokenType the token type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lgsp token, or <code>null</code> if a matching lgsp token could not be found
	*/
	public static LGSPToken fetchByF_TYPE_EXPIRY_First(String tokenType,
		OrderByComparator<LGSPToken> orderByComparator) {
		return getPersistence()
				   .fetchByF_TYPE_EXPIRY_First(tokenType, orderByComparator);
	}

	/**
	* Returns the last lgsp token in the ordered set where tokenType = &#63;.
	*
	* @param tokenType the token type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lgsp token
	* @throws NoSuchLGSPTokenException if a matching lgsp token could not be found
	*/
	public static LGSPToken findByF_TYPE_EXPIRY_Last(String tokenType,
		OrderByComparator<LGSPToken> orderByComparator)
		throws org.opencps.communication.exception.NoSuchLGSPTokenException {
		return getPersistence()
				   .findByF_TYPE_EXPIRY_Last(tokenType, orderByComparator);
	}

	/**
	* Returns the last lgsp token in the ordered set where tokenType = &#63;.
	*
	* @param tokenType the token type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lgsp token, or <code>null</code> if a matching lgsp token could not be found
	*/
	public static LGSPToken fetchByF_TYPE_EXPIRY_Last(String tokenType,
		OrderByComparator<LGSPToken> orderByComparator) {
		return getPersistence()
				   .fetchByF_TYPE_EXPIRY_Last(tokenType, orderByComparator);
	}

	/**
	* Returns the lgsp tokens before and after the current lgsp token in the ordered set where tokenType = &#63;.
	*
	* @param tokenId the primary key of the current lgsp token
	* @param tokenType the token type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lgsp token
	* @throws NoSuchLGSPTokenException if a lgsp token with the primary key could not be found
	*/
	public static LGSPToken[] findByF_TYPE_EXPIRY_PrevAndNext(long tokenId,
		String tokenType, OrderByComparator<LGSPToken> orderByComparator)
		throws org.opencps.communication.exception.NoSuchLGSPTokenException {
		return getPersistence()
				   .findByF_TYPE_EXPIRY_PrevAndNext(tokenId, tokenType,
			orderByComparator);
	}

	/**
	* Removes all the lgsp tokens where tokenType = &#63; from the database.
	*
	* @param tokenType the token type
	*/
	public static void removeByF_TYPE_EXPIRY(String tokenType) {
		getPersistence().removeByF_TYPE_EXPIRY(tokenType);
	}

	/**
	* Returns the number of lgsp tokens where tokenType = &#63;.
	*
	* @param tokenType the token type
	* @return the number of matching lgsp tokens
	*/
	public static int countByF_TYPE_EXPIRY(String tokenType) {
		return getPersistence().countByF_TYPE_EXPIRY(tokenType);
	}

	/**
	* Caches the lgsp token in the entity cache if it is enabled.
	*
	* @param lgspToken the lgsp token
	*/
	public static void cacheResult(LGSPToken lgspToken) {
		getPersistence().cacheResult(lgspToken);
	}

	/**
	* Caches the lgsp tokens in the entity cache if it is enabled.
	*
	* @param lgspTokens the lgsp tokens
	*/
	public static void cacheResult(List<LGSPToken> lgspTokens) {
		getPersistence().cacheResult(lgspTokens);
	}

	/**
	* Creates a new lgsp token with the primary key. Does not add the lgsp token to the database.
	*
	* @param tokenId the primary key for the new lgsp token
	* @return the new lgsp token
	*/
	public static LGSPToken create(long tokenId) {
		return getPersistence().create(tokenId);
	}

	/**
	* Removes the lgsp token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tokenId the primary key of the lgsp token
	* @return the lgsp token that was removed
	* @throws NoSuchLGSPTokenException if a lgsp token with the primary key could not be found
	*/
	public static LGSPToken remove(long tokenId)
		throws org.opencps.communication.exception.NoSuchLGSPTokenException {
		return getPersistence().remove(tokenId);
	}

	public static LGSPToken updateImpl(LGSPToken lgspToken) {
		return getPersistence().updateImpl(lgspToken);
	}

	/**
	* Returns the lgsp token with the primary key or throws a {@link NoSuchLGSPTokenException} if it could not be found.
	*
	* @param tokenId the primary key of the lgsp token
	* @return the lgsp token
	* @throws NoSuchLGSPTokenException if a lgsp token with the primary key could not be found
	*/
	public static LGSPToken findByPrimaryKey(long tokenId)
		throws org.opencps.communication.exception.NoSuchLGSPTokenException {
		return getPersistence().findByPrimaryKey(tokenId);
	}

	/**
	* Returns the lgsp token with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tokenId the primary key of the lgsp token
	* @return the lgsp token, or <code>null</code> if a lgsp token with the primary key could not be found
	*/
	public static LGSPToken fetchByPrimaryKey(long tokenId) {
		return getPersistence().fetchByPrimaryKey(tokenId);
	}

	public static java.util.Map<java.io.Serializable, LGSPToken> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the lgsp tokens.
	*
	* @return the lgsp tokens
	*/
	public static List<LGSPToken> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lgsp tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @return the range of lgsp tokens
	*/
	public static List<LGSPToken> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lgsp tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lgsp tokens
	*/
	public static List<LGSPToken> findAll(int start, int end,
		OrderByComparator<LGSPToken> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lgsp tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LGSPTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lgsp tokens
	* @param end the upper bound of the range of lgsp tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of lgsp tokens
	*/
	public static List<LGSPToken> findAll(int start, int end,
		OrderByComparator<LGSPToken> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the lgsp tokens from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lgsp tokens.
	*
	* @return the number of lgsp tokens
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LGSPTokenPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LGSPTokenPersistence, LGSPTokenPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LGSPTokenPersistence.class);

		ServiceTracker<LGSPTokenPersistence, LGSPTokenPersistence> serviceTracker =
			new ServiceTracker<LGSPTokenPersistence, LGSPTokenPersistence>(bundle.getBundleContext(),
				LGSPTokenPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}