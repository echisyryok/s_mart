package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	public List<Product> select(int prop) {
		List<Product> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		String sql = "select * from Product where prop=? order by pno";	
				try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, prop);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Product pro = new Product();
				pro.setPno(rs.getInt("pno"));
				pro.setPname(rs.getString("pname"));
				pro.setPrice(rs.getInt("price"));
				pro.setPsto(rs.getInt("psto"));
				pro.setProp(rs.getInt("prop"));
				pro.setPre(rs.getInt("pre"));
				pro.setPco(rs.getInt("pco"));
				pro.setPic(rs.getString("pic"));
							
				list.add(pro);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
		
	}
	public Product proselect(int pno) {
		Product pro = new Product();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from Product where pno=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pro.setPno(rs.getInt("pno"));
				pro.setPname(rs.getString("pname"));
				pro.setPrice(rs.getInt("price"));
				pro.setPsto(rs.getInt("psto"));
				pro.setProp(rs.getInt("prop"));
				pro.setPre(rs.getInt("pre"));
				pro.setPco(rs.getInt("pco"));
				pro.setPic(rs.getString("pic"));
				
			} else
				pro = null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return pro;
	}
	
}
