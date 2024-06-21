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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

import user.entelgy.data.service.exception.NoSuchUserEntelgyException;
import user.entelgy.data.service.model.UserEntelgy;

/**
 * The persistence interface for the user entelgy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEntelgyUtil
 * @generated
 */
@ProviderType
public interface UserEntelgyPersistence extends BasePersistence<UserEntelgy> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserEntelgyUtil} to access the user entelgy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @return the matching user entelgies
	 */
	public java.util.List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId);

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
	public java.util.List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end);

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
	public java.util.List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
			orderByComparator);

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
	public java.util.List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user entelgy
	 * @throws NoSuchUserEntelgyException if a matching user entelgy could not be found
	 */
	public UserEntelgy findByActiveUser_First(
			Boolean activeUser, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
				orderByComparator)
		throws NoSuchUserEntelgyException;

	/**
	 * Returns the first user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user entelgy, or <code>null</code> if a matching user entelgy could not be found
	 */
	public UserEntelgy fetchByActiveUser_First(
		Boolean activeUser, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
			orderByComparator);

	/**
	 * Returns the last user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user entelgy
	 * @throws NoSuchUserEntelgyException if a matching user entelgy could not be found
	 */
	public UserEntelgy findByActiveUser_Last(
			Boolean activeUser, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
				orderByComparator)
		throws NoSuchUserEntelgyException;

	/**
	 * Returns the last user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user entelgy, or <code>null</code> if a matching user entelgy could not be found
	 */
	public UserEntelgy fetchByActiveUser_Last(
		Boolean activeUser, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
			orderByComparator);

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
	public UserEntelgy[] findByActiveUser_PrevAndNext(
			long userEntelgyId, Boolean activeUser, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
				orderByComparator)
		throws NoSuchUserEntelgyException;

	/**
	 * Removes all the user entelgies where activeUser = &#63; and groupId = &#63; from the database.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 */
	public void removeByActiveUser(Boolean activeUser, long groupId);

	/**
	 * Returns the number of user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @return the number of matching user entelgies
	 */
	public int countByActiveUser(Boolean activeUser, long groupId);

	/**
	 * Caches the user entelgy in the entity cache if it is enabled.
	 *
	 * @param userEntelgy the user entelgy
	 */
	public void cacheResult(UserEntelgy userEntelgy);

	/**
	 * Caches the user entelgies in the entity cache if it is enabled.
	 *
	 * @param userEntelgies the user entelgies
	 */
	public void cacheResult(java.util.List<UserEntelgy> userEntelgies);

	/**
	 * Creates a new user entelgy with the primary key. Does not add the user entelgy to the database.
	 *
	 * @param userEntelgyId the primary key for the new user entelgy
	 * @return the new user entelgy
	 */
	public UserEntelgy create(long userEntelgyId);

	/**
	 * Removes the user entelgy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy that was removed
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	public UserEntelgy remove(long userEntelgyId)
		throws NoSuchUserEntelgyException;

	public UserEntelgy updateImpl(UserEntelgy userEntelgy);

	/**
	 * Returns the user entelgy with the primary key or throws a <code>NoSuchUserEntelgyException</code> if it could not be found.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	public UserEntelgy findByPrimaryKey(long userEntelgyId)
		throws NoSuchUserEntelgyException;

	/**
	 * Returns the user entelgy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy, or <code>null</code> if a user entelgy with the primary key could not be found
	 */
	public UserEntelgy fetchByPrimaryKey(long userEntelgyId);

	/**
	 * Returns all the user entelgies.
	 *
	 * @return the user entelgies
	 */
	public java.util.List<UserEntelgy> findAll();

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
	public java.util.List<UserEntelgy> findAll(int start, int end);

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
	public java.util.List<UserEntelgy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
			orderByComparator);

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
	public java.util.List<UserEntelgy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEntelgy>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user entelgies from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user entelgies.
	 *
	 * @return the number of user entelgies
	 */
	public int countAll();

}