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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

import user.entelgy.data.service.model.UserEntelgy;
import user.entelgy.data.service.model.UserEntelgyModel;

/**
 * The base model implementation for the UserEntelgy service. Represents a row in the &quot;ENTELGYUSER_UserEntelgy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>UserEntelgyModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserEntelgyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEntelgyImpl
 * @generated
 */
@JSON(strict = true)
public class UserEntelgyModelImpl
	extends BaseModelImpl<UserEntelgy> implements UserEntelgyModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user entelgy model instance should use the <code>UserEntelgy</code> interface instead.
	 */
	public static final String TABLE_NAME = "ENTELGYUSER_UserEntelgy";

	public static final Object[][] TABLE_COLUMNS = {
		{"userEntelgyId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"firstName", Types.VARCHAR},
		{"lastName", Types.VARCHAR}, {"activeUser", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("userEntelgyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("firstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("activeUser", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ENTELGYUSER_UserEntelgy (userEntelgyId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,firstName VARCHAR(75) null,lastName VARCHAR(75) null,activeUser BOOLEAN)";

	public static final String TABLE_SQL_DROP =
		"drop table ENTELGYUSER_UserEntelgy";

	public static final String ORDER_BY_JPQL =
		" ORDER BY userEntelgy.firstName ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ENTELGYUSER_UserEntelgy.firstName ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ACTIVEUSER_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long FIRSTNAME_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public UserEntelgyModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userEntelgyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserEntelgyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userEntelgyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UserEntelgy.class;
	}

	@Override
	public String getModelClassName() {
		return UserEntelgy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<UserEntelgy, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<UserEntelgy, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserEntelgy, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((UserEntelgy)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<UserEntelgy, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<UserEntelgy, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(UserEntelgy)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<UserEntelgy, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<UserEntelgy, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<UserEntelgy, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<UserEntelgy, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<UserEntelgy, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<UserEntelgy, Object>>();
		Map<String, BiConsumer<UserEntelgy, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<UserEntelgy, ?>>();

		attributeGetterFunctions.put(
			"userEntelgyId", UserEntelgy::getUserEntelgyId);
		attributeSetterBiConsumers.put(
			"userEntelgyId",
			(BiConsumer<UserEntelgy, Long>)UserEntelgy::setUserEntelgyId);
		attributeGetterFunctions.put("groupId", UserEntelgy::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<UserEntelgy, Long>)UserEntelgy::setGroupId);
		attributeGetterFunctions.put("companyId", UserEntelgy::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<UserEntelgy, Long>)UserEntelgy::setCompanyId);
		attributeGetterFunctions.put("userId", UserEntelgy::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<UserEntelgy, Long>)UserEntelgy::setUserId);
		attributeGetterFunctions.put("userName", UserEntelgy::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<UserEntelgy, String>)UserEntelgy::setUserName);
		attributeGetterFunctions.put("createDate", UserEntelgy::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<UserEntelgy, Date>)UserEntelgy::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", UserEntelgy::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<UserEntelgy, Date>)UserEntelgy::setModifiedDate);
		attributeGetterFunctions.put("firstName", UserEntelgy::getFirstName);
		attributeSetterBiConsumers.put(
			"firstName",
			(BiConsumer<UserEntelgy, String>)UserEntelgy::setFirstName);
		attributeGetterFunctions.put("lastName", UserEntelgy::getLastName);
		attributeSetterBiConsumers.put(
			"lastName",
			(BiConsumer<UserEntelgy, String>)UserEntelgy::setLastName);
		attributeGetterFunctions.put("activeUser", UserEntelgy::getActiveUser);
		attributeSetterBiConsumers.put(
			"activeUser",
			(BiConsumer<UserEntelgy, Boolean>)UserEntelgy::setActiveUser);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getUserEntelgyId() {
		return _userEntelgyId;
	}

	@Override
	public void setUserEntelgyId(long userEntelgyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userEntelgyId = userEntelgyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return "";
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_firstName = firstName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_lastName = lastName;
	}

	@JSON
	@Override
	public Boolean getActiveUser() {
		return _activeUser;
	}

	@Override
	public void setActiveUser(Boolean activeUser) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_activeUser = activeUser;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public Boolean getOriginalActiveUser() {
		return GetterUtil.getBoolean(
			this.<Boolean>getColumnOriginalValue("activeUser"));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), UserEntelgy.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserEntelgy toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, UserEntelgy>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserEntelgyImpl userEntelgyImpl = new UserEntelgyImpl();

		userEntelgyImpl.setUserEntelgyId(getUserEntelgyId());
		userEntelgyImpl.setGroupId(getGroupId());
		userEntelgyImpl.setCompanyId(getCompanyId());
		userEntelgyImpl.setUserId(getUserId());
		userEntelgyImpl.setUserName(getUserName());
		userEntelgyImpl.setCreateDate(getCreateDate());
		userEntelgyImpl.setModifiedDate(getModifiedDate());
		userEntelgyImpl.setFirstName(getFirstName());
		userEntelgyImpl.setLastName(getLastName());
		userEntelgyImpl.setActiveUser(getActiveUser());

		userEntelgyImpl.resetOriginalValues();

		return userEntelgyImpl;
	}

	@Override
	public UserEntelgy cloneWithOriginalValues() {
		UserEntelgyImpl userEntelgyImpl = new UserEntelgyImpl();

		userEntelgyImpl.setUserEntelgyId(
			this.<Long>getColumnOriginalValue("userEntelgyId"));
		userEntelgyImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		userEntelgyImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		userEntelgyImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		userEntelgyImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		userEntelgyImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		userEntelgyImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		userEntelgyImpl.setFirstName(
			this.<String>getColumnOriginalValue("firstName"));
		userEntelgyImpl.setLastName(
			this.<String>getColumnOriginalValue("lastName"));
		userEntelgyImpl.setActiveUser(
			this.<Boolean>getColumnOriginalValue("activeUser"));

		return userEntelgyImpl;
	}

	@Override
	public int compareTo(UserEntelgy userEntelgy) {
		int value = 0;

		value = getFirstName().compareTo(userEntelgy.getFirstName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserEntelgy)) {
			return false;
		}

		UserEntelgy userEntelgy = (UserEntelgy)object;

		long primaryKey = userEntelgy.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<UserEntelgy> toCacheModel() {
		UserEntelgyCacheModel userEntelgyCacheModel =
			new UserEntelgyCacheModel();

		userEntelgyCacheModel.userEntelgyId = getUserEntelgyId();

		userEntelgyCacheModel.groupId = getGroupId();

		userEntelgyCacheModel.companyId = getCompanyId();

		userEntelgyCacheModel.userId = getUserId();

		userEntelgyCacheModel.userName = getUserName();

		String userName = userEntelgyCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			userEntelgyCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			userEntelgyCacheModel.createDate = createDate.getTime();
		}
		else {
			userEntelgyCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			userEntelgyCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			userEntelgyCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		userEntelgyCacheModel.firstName = getFirstName();

		String firstName = userEntelgyCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			userEntelgyCacheModel.firstName = null;
		}

		userEntelgyCacheModel.lastName = getLastName();

		String lastName = userEntelgyCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			userEntelgyCacheModel.lastName = null;
		}

		Boolean activeUser = getActiveUser();

		if (activeUser != null) {
			userEntelgyCacheModel.activeUser = activeUser;
		}

		return userEntelgyCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<UserEntelgy, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<UserEntelgy, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserEntelgy, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((UserEntelgy)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, UserEntelgy>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					UserEntelgy.class, ModelWrapper.class);

	}

	private long _userEntelgyId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _firstName;
	private String _lastName;
	private Boolean _activeUser;

	public <T> T getColumnValue(String columnName) {
		Function<UserEntelgy, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((UserEntelgy)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("userEntelgyId", _userEntelgyId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("firstName", _firstName);
		_columnOriginalValues.put("lastName", _lastName);
		_columnOriginalValues.put("activeUser", _activeUser);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("userEntelgyId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("firstName", 128L);

		columnBitmasks.put("lastName", 256L);

		columnBitmasks.put("activeUser", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private UserEntelgy _escapedModel;

}