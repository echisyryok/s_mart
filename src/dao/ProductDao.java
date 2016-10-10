package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ProductDao {
	private static ProductDao instance;
	public static ProductDao getInstance() {
		if (instance==null) {	instance = new ProductDao();  	}
		return instance;
	}
	private ProductDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MySql");
		conn = ds.getConnection();
		return conn;
	}
}
