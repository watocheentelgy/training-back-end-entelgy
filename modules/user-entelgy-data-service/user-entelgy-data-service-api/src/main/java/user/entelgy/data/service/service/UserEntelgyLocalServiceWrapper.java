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

package user.entelgy.data.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserEntelgyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserEntelgyLocalService
 * @generated
 */
public class UserEntelgyLocalServiceWrapper
	implements ServiceWrapper<UserEntelgyLocalService>,
			   UserEntelgyLocalService {

	public UserEntelgyLocalServiceWrapper() {
		this(null);
	}

	public UserEntelgyLocalServiceWrapper(
		UserEntelgyLocalService userEntelgyLocalService) {

		_userEntelgyLocalService = userEntelgyLocalService;
	}

	/**
	 * Adds the user entelgy to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEntelgyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEntelgy the user entelgy
	 * @return the user entelgy that was added
	 */
	@Override
	public user.entelgy.data.service.model.UserEntelgy addUserEntelgy(
		user.entelgy.data.service.model.UserEntelgy userEntelgy) {

		return _userEntelgyLocalService.addUserEntelgy(userEntelgy);
	}

	@Override
	public int countAllUserEntelgy() {
		return _userEntelgyLocalService.countAllUserEntelgy();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEntelgyLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new user entelgy with the primary key. Does not add the user entelgy to the database.
	 *
	 * @param userEntelgyId the primary key for the new user entelgy
	 * @return the new user entelgy
	 */
	@Override
	public user.entelgy.data.service.model.UserEntelgy createUserEntelgy(
		long userEntelgyId) {

		return _userEntelgyLocalService.createUserEntelgy(userEntelgyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEntelgyLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the user entelgy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEntelgyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy that was removed
	 * @throws PortalException if a user entelgy with the primary key could not be found
	 */
	@Override
	public user.entelgy.data.service.model.UserEntelgy deleteUserEntelgy(
			long userEntelgyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEntelgyLocalService.deleteUserEntelgy(userEntelgyId);
	}

	/**
	 * Deletes the user entelgy from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEntelgyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEntelgy the user entelgy
	 * @return the user entelgy that was removed
	 */
	@Override
	public user.entelgy.data.service.model.UserEntelgy deleteUserEntelgy(
		user.entelgy.data.service.model.UserEntelgy userEntelgy) {

		return _userEntelgyLocalService.deleteUserEntelgy(userEntelgy);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _userEntelgyLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _userEntelgyLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userEntelgyLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userEntelgyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>user.entelgy.data.service.model.impl.UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _userEntelgyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>user.entelgy.data.service.model.impl.UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _userEntelgyLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userEntelgyLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _userEntelgyLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public user.entelgy.data.service.model.UserEntelgy fetchUserEntelgy(
		long userEntelgyId) {

		return _userEntelgyLocalService.fetchUserEntelgy(userEntelgyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _userEntelgyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _userEntelgyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userEntelgyLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEntelgyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the user entelgies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>user.entelgy.data.service.model.impl.UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @return the range of user entelgies
	 */
	@Override
	public java.util.List<user.entelgy.data.service.model.UserEntelgy>
		getUserEntelgies(int start, int end) {

		return _userEntelgyLocalService.getUserEntelgies(start, end);
	}

	/**
	 * Returns the number of user entelgies.
	 *
	 * @return the number of user entelgies
	 */
	@Override
	public int getUserEntelgiesCount() {
		return _userEntelgyLocalService.getUserEntelgiesCount();
	}

	/**
	 * Returns the user entelgy with the primary key.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy
	 * @throws PortalException if a user entelgy with the primary key could not be found
	 */
	@Override
	public user.entelgy.data.service.model.UserEntelgy getUserEntelgy(
			long userEntelgyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEntelgyLocalService.getUserEntelgy(userEntelgyId);
	}

	/**
	 * Updates the user entelgy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEntelgyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEntelgy the user entelgy
	 * @return the user entelgy that was updated
	 */
	@Override
	public user.entelgy.data.service.model.UserEntelgy updateUserEntelgy(
		user.entelgy.data.service.model.UserEntelgy userEntelgy) {

		return _userEntelgyLocalService.updateUserEntelgy(userEntelgy);
	}

	@Override
	public UserEntelgyLocalService getWrappedService() {
		return _userEntelgyLocalService;
	}

	@Override
	public void setWrappedService(
		UserEntelgyLocalService userEntelgyLocalService) {

		_userEntelgyLocalService = userEntelgyLocalService;
	}

	private UserEntelgyLocalService _userEntelgyLocalService;

}