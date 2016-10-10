package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DepartmentDao {
	private static DepartmentDao instance;
	public static DepartmentDao getInstance() {
		if (instance==null) {	instance = new DepartmentDao();  	}
		return instance;
	}
	private DepartmentDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MySql");
		conn = ds.getConnection();
		return conn;
	}
}
