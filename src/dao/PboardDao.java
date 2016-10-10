package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PboardDao {
	private static PboardDao instance;
	public static PboardDao getInstance() {
		if (instance==null) {	instance = new PboardDao();  	}
		return instance;
	}
	private PboardDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MySql");
		conn = ds.getConnection();
		return conn;
	}

}
