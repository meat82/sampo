package com.template.sql.util;

public class SQLLogger {

	public static String getSQLLog(String sql, String...args) {
		
		for(String arg : args) {
			sql = sql.replaceFirst("\\?", arg);
		}
		
		return sql;
	}
	
}
