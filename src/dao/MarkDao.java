package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MarkDao {
	private static MarkDao instance;
	public static MarkDao getInstance() {
		if (instance==null) {	instance = new MarkDao();  	}
		return instance;
	}
	private MarkDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MySql");
		conn = ds.getConnection();
		return conn;
	}
}
