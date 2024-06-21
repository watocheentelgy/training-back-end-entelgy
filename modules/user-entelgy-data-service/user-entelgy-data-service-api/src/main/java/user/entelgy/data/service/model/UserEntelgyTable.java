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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ENTELGYUSER_UserEntelgy&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see UserEntelgy
 * @generated
 */
public class UserEntelgyTable extends BaseTable<UserEntelgyTable> {

	public static final UserEntelgyTable INSTANCE = new UserEntelgyTable();

	public final Column<UserEntelgyTable, Long> userEntelgyId = createColumn(
		"userEntelgyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<UserEntelgyTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UserEntelgyTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UserEntelgyTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UserEntelgyTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserEntelgyTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UserEntelgyTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UserEntelgyTable, String> firstName = createColumn(
		"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserEntelgyTable, String> lastName = createColumn(
		"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserEntelgyTable, Boolean> activeUser = createColumn(
		"activeUser", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private UserEntelgyTable() {
		super("ENTELGYUSER_UserEntelgy", UserEntelgyTable::new);
	}

}