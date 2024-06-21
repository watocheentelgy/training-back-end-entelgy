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

package user.entelgy.data.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import user.entelgy.data.service.model.UserEntelgy;

/**
 * The persistence utility for the user entelgy service. This utility wraps <code>user.entelgy.data.service.service.persistence.impl.UserEntelgyPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEntelgyPersistence
 * @generated
 */
public class UserEntelgyUtil {

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
	public static void clearCache(UserEntelgy userEntelgy) {
		getPersistence().clearCache(userEntelgy);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, UserEntelgy> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserEntelgy> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserEntelgy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserEntelgy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UserEntelgy> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UserEntelgy update(UserEntelgy userEntelgy) {
		return getPersistence().update(userEntelgy);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UserEntelgy update(
		UserEntelgy userEntelgy, ServiceContext serviceContext) {

		return getPersistence().update(userEntelgy, serviceContext);
	}

	/**
	 * Returns all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @return the matching user entelgies
	 */
	public static List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId) {

		return getPersistence().findByActiveUser(activeUser, groupId);
	}

	/**
	 * Returns a range of all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @return the range of matching user entelgies
	 */
	public static List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end) {

		return getPersistence().findByActiveUser(
			activeUser, groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user entelgies
	 */
	public static List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end,
		OrderByComparator<UserEntelgy> orderByComparator) {

		return getPersistence().findByActiveUser(
			activeUser, groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user entelgies
	 */
	public static List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end,
		OrderByComparator<UserEntelgy> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByActiveUser(
			activeUser, groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user entelgy
	 * @throws NoSuchUserEntelgyException if a matching user entelgy could not be found
	 */
	public static UserEntelgy findByActiveUser_First(
			Boolean activeUser, long groupId,
			OrderByComparator<UserEntelgy> orderByComparator)
		throws user.entelgy.data.service.exception.NoSuchUserEntelgyException {

		return getPersistence().findByActiveUser_First(
			activeUser, groupId, orderByComparator);
	}

	/**
	 * Returns the first user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user entelgy, or <code>null</code> if a matching user entelgy could not be found
	 */
	public static UserEntelgy fetchByActiveUser_First(
		Boolean activeUser, long groupId,
		OrderByComparator<UserEntelgy> orderByComparator) {

		return getPersistence().fetchByActiveUser_First(
			activeUser, groupId, orderByComparator);
	}

	/**
	 * Returns the last user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user entelgy
	 * @throws NoSuchUserEntelgyException if a matching user entelgy could not be found
	 */
	public static UserEntelgy findByActiveUser_Last(
			Boolean activeUser, long groupId,
			OrderByComparator<UserEntelgy> orderByComparator)
		throws user.entelgy.data.service.exception.NoSuchUserEntelgyException {

		return getPersistence().findByActiveUser_Last(
			activeUser, groupId, orderByComparator);
	}

	/**
	 * Returns the last user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user entelgy, or <code>null</code> if a matching user entelgy could not be found
	 */
	public static UserEntelgy fetchByActiveUser_Last(
		Boolean activeUser, long groupId,
		OrderByComparator<UserEntelgy> orderByComparator) {

		return getPersistence().fetchByActiveUser_Last(
			activeUser, groupId, orderByComparator);
	}

	/**
	 * Returns the user entelgies before and after the current user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param userEntelgyId the primary key of the current user entelgy
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user entelgy
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	public static UserEntelgy[] findByActiveUser_PrevAndNext(
			long userEntelgyId, Boolean activeUser, long groupId,
			OrderByComparator<UserEntelgy> orderByComparator)
		throws user.entelgy.data.service.exception.NoSuchUserEntelgyException {

		return getPersistence().findByActiveUser_PrevAndNext(
			userEntelgyId, activeUser, groupId, orderByComparator);
	}

	/**
	 * Removes all the user entelgies where activeUser = &#63; and groupId = &#63; from the database.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 */
	public static void removeByActiveUser(Boolean activeUser, long groupId) {
		getPersistence().removeByActiveUser(activeUser, groupId);
	}

	/**
	 * Returns the number of user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @return the number of matching user entelgies
	 */
	public static int countByActiveUser(Boolean activeUser, long groupId) {
		return getPersistence().countByActiveUser(activeUser, groupId);
	}

	/**
	 * Caches the user entelgy in the entity cache if it is enabled.
	 *
	 * @param userEntelgy the user entelgy
	 */
	public static void cacheResult(UserEntelgy userEntelgy) {
		getPersistence().cacheResult(userEntelgy);
	}

	/**
	 * Caches the user entelgies in the entity cache if it is enabled.
	 *
	 * @param userEntelgies the user entelgies
	 */
	public static void cacheResult(List<UserEntelgy> userEntelgies) {
		getPersistence().cacheResult(userEntelgies);
	}

	/**
	 * Creates a new user entelgy with the primary key. Does not add the user entelgy to the database.
	 *
	 * @param userEntelgyId the primary key for the new user entelgy
	 * @return the new user entelgy
	 */
	public static UserEntelgy create(long userEntelgyId) {
		return getPersistence().create(userEntelgyId);
	}

	/**
	 * Removes the user entelgy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy that was removed
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	public static UserEntelgy remove(long userEntelgyId)
		throws user.entelgy.data.service.exception.NoSuchUserEntelgyException {

		return getPersistence().remove(userEntelgyId);
	}

	public static UserEntelgy updateImpl(UserEntelgy userEntelgy) {
		return getPersistence().updateImpl(userEntelgy);
	}

	/**
	 * Returns the user entelgy with the primary key or throws a <code>NoSuchUserEntelgyException</code> if it could not be found.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	public static UserEntelgy findByPrimaryKey(long userEntelgyId)
		throws user.entelgy.data.service.exception.NoSuchUserEntelgyException {

		return getPersistence().findByPrimaryKey(userEntelgyId);
	}

	/**
	 * Returns the user entelgy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy, or <code>null</code> if a user entelgy with the primary key could not be found
	 */
	public static UserEntelgy fetchByPrimaryKey(long userEntelgyId) {
		return getPersistence().fetchByPrimaryKey(userEntelgyId);
	}

	/**
	 * Returns all the user entelgies.
	 *
	 * @return the user entelgies
	 */
	public static List<UserEntelgy> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the user entelgies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @return the range of user entelgies
	 */
	public static List<UserEntelgy> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the user entelgies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user entelgies
	 */
	public static List<UserEntelgy> findAll(
		int start, int end, OrderByComparator<UserEntelgy> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user entelgies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user entelgies
	 */
	public static List<UserEntelgy> findAll(
		int start, int end, OrderByComparator<UserEntelgy> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the user entelgies from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of user entelgies.
	 *
	 * @return the number of user entelgies
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UserEntelgyPersistence getPersistence() {
		return _persistence;
	}

	private static volatile UserEntelgyPersistence _persistence;

}