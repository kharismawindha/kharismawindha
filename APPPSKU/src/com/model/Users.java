package com.model;

public class Users {

	public String Database = "appsku";
	
	public String TABLE_NAME = "USER";
	public String COLUMN_ID_USER = "ID";
	public String COLUMN_USERNAME_USER = "USERNAME";
	public String COLUMN_PASSWORD_USER = "PASSWORD";
	public String COLUMN_TYPE_USER = "TYPE";
	
	public String CREAT_TABLE_USER = "CREAT TABLE "+TABLE_NAME+" ("
			+COLUMN_ID_USER+" INTEGER PRIMARY KEY AUTO_INTCREMENT,"
			+COLUMN_USERNAME_USER+" TEXT, "
			+COLUMN_PASSWORD_USER+" TEXT"
			+COLUMN_TYPE_USER+" TEXT";
}
