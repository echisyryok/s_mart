package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

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
	public int cartInput(Cart cart) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into Cart values (?,?,?,?,?,?,?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
									
			pstmt.setInt(1, cart.getCtno());
			pstmt.setString(2, cart.getPname());
			pstmt.setInt(3, cart.getPno());
			pstmt.setInt(4, cart.getPrice());
			pstmt.setInt(5, cart.getPget());
			pstmt.setInt(6, cart.getCin());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return result;
		
		
		
		
	}
}
