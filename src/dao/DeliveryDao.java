package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DeliveryDao {
	private static DeliveryDao instance;
	public static DeliveryDao getInstance() {
		if (instance==null) {	instance = new DeliveryDao();  	}
		return instance;
	}
	private DeliveryDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MySql");
		conn = ds.getConnection();
		return conn;
	}
}
