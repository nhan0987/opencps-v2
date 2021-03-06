create index IX_6D65FCCE on opencps_adminconfig (code_[$COLUMN_LENGTH:255$]);

create index IX_D64CC8C9 on opencps_dynamicreport (groupId, reportCode[$COLUMN_LENGTH:128$]);
create index IX_F3E18AD6 on opencps_dynamicreport (groupId, reportType[$COLUMN_LENGTH:128$]);

create index IX_A0A5C810 on opencps_reportrole (dynamicReportId, roleId);
create index IX_19973198 on opencps_reportrole (roleId);