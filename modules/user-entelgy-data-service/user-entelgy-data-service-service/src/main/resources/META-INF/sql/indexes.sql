create index IX_2EC6AC76 on ENTELGYUSER_UserEntelgy (activeUser, groupId);

create index IX_91C8ED5F on FOO_UserEntelgy (activeUser, groupId);
create index IX_272C56FA on FOO_UserEntelgy (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_93F253FC on FOO_UserEntelgy (uuid_[$COLUMN_LENGTH:75$], groupId);