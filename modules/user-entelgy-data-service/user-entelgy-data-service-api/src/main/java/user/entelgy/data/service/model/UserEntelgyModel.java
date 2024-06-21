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

package user.entelgy.data.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the UserEntelgy service. Represents a row in the &quot;ENTELGYUSER_UserEntelgy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>user.entelgy.data.service.model.impl.UserEntelgyModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>user.entelgy.data.service.model.impl.UserEntelgyImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEntelgy
 * @generated
 */
@ProviderType
public interface UserEntelgyModel
	extends BaseModel<UserEntelgy>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user entelgy model instance should use the {@link UserEntelgy} interface instead.
	 */

	/**
	 * Returns the primary key of this user entelgy.
	 *
	 * @return the primary key of this user entelgy
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user entelgy.
	 *
	 * @param primaryKey the primary key of this user entelgy
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user entelgy ID of this user entelgy.
	 *
	 * @return the user entelgy ID of this user entelgy
	 */
	public long getUserEntelgyId();

	/**
	 * Sets the user entelgy ID of this user entelgy.
	 *
	 * @param userEntelgyId the user entelgy ID of this user entelgy
	 */
	public void setUserEntelgyId(long userEntelgyId);

	/**
	 * Returns the group ID of this user entelgy.
	 *
	 * @return the group ID of this user entelgy
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this user entelgy.
	 *
	 * @param groupId the group ID of this user entelgy
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this user entelgy.
	 *
	 * @return the company ID of this user entelgy
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this user entelgy.
	 *
	 * @param companyId the company ID of this user entelgy
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this user entelgy.
	 *
	 * @return the user ID of this user entelgy
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this user entelgy.
	 *
	 * @param userId the user ID of this user entelgy
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user entelgy.
	 *
	 * @return the user uuid of this user entelgy
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user entelgy.
	 *
	 * @param userUuid the user uuid of this user entelgy
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this user entelgy.
	 *
	 * @return the user name of this user entelgy
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this user entelgy.
	 *
	 * @param userName the user name of this user entelgy
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this user entelgy.
	 *
	 * @return the create date of this user entelgy
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this user entelgy.
	 *
	 * @param createDate the create date of this user entelgy
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this user entelgy.
	 *
	 * @return the modified date of this user entelgy
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user entelgy.
	 *
	 * @param modifiedDate the modified date of this user entelgy
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the first name of this user entelgy.
	 *
	 * @return the first name of this user entelgy
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this user entelgy.
	 *
	 * @param firstName the first name of this user entelgy
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this user entelgy.
	 *
	 * @return the last name of this user entelgy
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this user entelgy.
	 *
	 * @param lastName the last name of this user entelgy
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the active user of this user entelgy.
	 *
	 * @return the active user of this user entelgy
	 */
	public Boolean getActiveUser();

	/**
	 * Sets the active user of this user entelgy.
	 *
	 * @param activeUser the active user of this user entelgy
	 */
	public void setActiveUser(Boolean activeUser);

	@Override
	public UserEntelgy cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}