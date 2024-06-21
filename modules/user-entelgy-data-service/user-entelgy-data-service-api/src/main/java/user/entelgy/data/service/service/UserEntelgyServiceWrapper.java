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
 * Provides a wrapper for {@link UserEntelgyService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserEntelgyService
 * @generated
 */
public class UserEntelgyServiceWrapper
	implements ServiceWrapper<UserEntelgyService>, UserEntelgyService {

	public UserEntelgyServiceWrapper() {
		this(null);
	}

	public UserEntelgyServiceWrapper(UserEntelgyService userEntelgyService) {
		_userEntelgyService = userEntelgyService;
	}

	@Override
	public int countAllUserEntelgy() {
		return _userEntelgyService.countAllUserEntelgy();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userEntelgyService.getOSGiServiceIdentifier();
	}

	@Override
	public UserEntelgyService getWrappedService() {
		return _userEntelgyService;
	}

	@Override
	public void setWrappedService(UserEntelgyService userEntelgyService) {
		_userEntelgyService = userEntelgyService;
	}

	private UserEntelgyService _userEntelgyService;

}