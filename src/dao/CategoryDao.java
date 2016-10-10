package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CategoryDao {
	private static CategoryDao instance;
	public static CategoryDao getInstance() {
		if (instance==null) {	instance = new CategoryDao();  	}
		return instance;
	}
	private CategoryDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MySql");
		conn = ds.getConnection();
		return conn;
	}
}
