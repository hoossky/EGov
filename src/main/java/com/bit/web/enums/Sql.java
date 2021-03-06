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
			result = "create database mariadb";
			break;
			
		case CREATE_USERS:
			result = "create table users(userid varchar(30)primary key,"+ 
                    " password varchar(30) ," +
                    " name varchar(30) ," +
                    " birthday varchar(30) ," +
                    " gender varchar(10) ," +
                    " regdate varchar(10) ," +
                    " telephone varchar(30))ENGINE=InnoDB DEFAULT CHARSET=UTF8" ;
			break;
			
		case DROP_USERS:
			result = "drop table users";
			break;
			
		case TRUNCATE_USERS:
			result = "truncate table users";
			break;
			
		case CREATE_ARTICLES:
			result =  "create table articles("
	                   + "article_number int auto_increment primary key,"
	                   + "file_number int  references files,"
	                   + "userid varchar(30)  references users,"
	                   + "comment varchar(500),"
	                   + "message varchar(50),"
	                   + "rating varchar(50), "
	                   + "boardtype varchar(50),"
	                   + "title varchar(300),"
	                   + "content varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=UTF8";
				break;
			
		case DROP_ARTICLES:
			result = "drop table articles";
			break;
			
		case TRUNCATE_ARTICLES:
			result = "truncate table articles";
			break;
			
		case CREATE_FIlES:
			 result =  "create table files("+
	                   "file_number int auto_increment primary key"+
	                   "file_name varchar(100)"+
	                    ")ENGINE=InnoDB DEFAULT CHARSET=UTF8";
				break;
						
		case DROP_FIlES:
			result = "drop table files";
			break;
			
		case TRUNCATE_FIlES:
			result = "truncate table files";
			break;
			
		}
		return null;
		
	}
}