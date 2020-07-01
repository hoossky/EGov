package com.bit.web.enums;

public enum Sql {
	CREATE_DB,
	CREATE_USERS, DROP_USERS, TRUNCATE_USERS,
	CREATE_ARTICLES, DROP_ARTICLES, TRUNCATE_ARTICLES,
	CREATE_FIlES, DROP_FIlES, TRUNCATE_FIlES;
	
	public String toString() {
		String result = "";
		switch(this) {
		case CREATE_DB:
			result = "create database ";
			break;
			
		case CREATE_USERS:
			result = "CREATE DB";
			break;
			
		case DROP_USERS:
			result = "drop table users";
			break;
			
		case TRUNCATE_USERS:
			result = "CREATE DB";
			break;
			
		case CREATE_ARTICLES:
			result = "CREATE DB";
			break;
			
		case DROP_ARTICLES:
			result = "drop table articles";
			break;
			
		case TRUNCATE_ARTICLES:
			result = "CREATE DB";
			break;
			
		case CREATE_FIlES:
			result = "create table files";/*(
					"filesSeq int auto_increment primary key"+
					"image varchar(30)" 
					)";
*/			break;
			
		case DROP_FIlES:
			result = "drop table images";
			break;
			
		case TRUNCATE_FIlES:
			result = "CREATE DB";
			break;
			
		}
		return null;
		
	}
}