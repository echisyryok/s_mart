package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CartDao {
	private static CartDao instance;
	public static CartDao getInstance() {
		if (instance==null) {	instance = new CartDao();  	}
		return instance;
	}
	private CartDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MysqlDB");
		conn = ds.getConnection();
		return conn;
	}
}
