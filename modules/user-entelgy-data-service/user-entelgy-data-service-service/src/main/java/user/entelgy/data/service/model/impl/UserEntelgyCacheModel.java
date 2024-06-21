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

package user.entelgy.data.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import user.entelgy.data.service.model.UserEntelgy;

/**
 * The cache model class for representing UserEntelgy in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserEntelgyCacheModel
	implements CacheModel<UserEntelgy>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserEntelgyCacheModel)) {
			return false;
		}

		UserEntelgyCacheModel userEntelgyCacheModel =
			(UserEntelgyCacheModel)object;

		if (userEntelgyId == userEntelgyCacheModel.userEntelgyId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userEntelgyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{userEntelgyId=");
		sb.append(userEntelgyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", activeUser=");
		sb.append(activeUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserEntelgy toEntityModel() {
		UserEntelgyImpl userEntelgyImpl = new UserEntelgyImpl();

		userEntelgyImpl.setUserEntelgyId(userEntelgyId);
		userEntelgyImpl.setGroupId(groupId);
		userEntelgyImpl.setCompanyId(companyId);
		userEntelgyImpl.setUserId(userId);

		if (userName == null) {
			userEntelgyImpl.setUserName("");
		}
		else {
			userEntelgyImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			userEntelgyImpl.setCreateDate(null);
		}
		else {
			userEntelgyImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userEntelgyImpl.setModifiedDate(null);
		}
		else {
			userEntelgyImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			userEntelgyImpl.setFirstName("");
		}
		else {
			userEntelgyImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			userEntelgyImpl.setLastName("");
		}
		else {
			userEntelgyImpl.setLastName(lastName);
		}

		userEntelgyImpl.setActiveUser(activeUser);

		userEntelgyImpl.resetOriginalValues();

		return userEntelgyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userEntelgyId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();

		activeUser = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(userEntelgyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeBoolean(activeUser);
	}

	public long userEntelgyId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public boolean activeUser;

}