create table ENTELGYUSER_UserEntelgy (
	userEntelgyId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	activeUser BOOLEAN
);

create table FOO_UserEntelgy (
	uuid_ VARCHAR(75) null,
	userEntelgyId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	activeUser BOOLEAN
);