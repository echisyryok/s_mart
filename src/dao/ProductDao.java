package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	 //상품 목록 보기
		public List<Product> select() {
			List<Product> list = new ArrayList<>();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "select * from product order by pno";	
				try {
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					/*
					 * pno
					 * pname
					 * price
					 * psto
					 * prop
					 * pic
					 * */
					Product item = new Product();
					item.setPno(rs.getInt("pno"));
					item.setPname(rs.getString("pname"));
					item.setPrice(rs.getInt("price"));
					item.setPsto(rs.getInt("psto"));
					item.setProp(rs.getInt("prop"));
					item.setPic(rs.getString("pic"));
					list.add(item);
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
		
		public int insert(Product proDto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
	        String sql="insert into product (pname,price,psto,prop,pic) VALUES(?,?,?,?,?)"; 
	        int result=0; 
	        try{ 

	        	/*
					pname,price,psto,prop
	        	*/
	        	conn = getConnection();
				pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, proDto.getPname()); 
	            pstmt.setInt(2, proDto.getPrice()); 
	            pstmt.setInt(3, proDto.getPsto()); 
	            pstmt.setInt(4, proDto.getProp()); 
	            pstmt.setString(5, proDto.getPic()); 

	            result=pstmt.executeUpdate(); 
	             
	            if(result!=0){ 
	                return result;
	            } 
	        }catch(Exception ex){ 
	            System.out.println("ProUpload 에러: " + ex);             
	        }finally{ 
	            if(rs!=null) try{rs.close();}catch(SQLException ex){} 
	            if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){} 
	        } 
	         
	        return result; 
		}
		public boolean modify(Product proDto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
	        String sql="update product set pname=?,price=?,psto=?,prop=?,pic=? where pno=?"; 
	        int result=0; 
	         
	        try{ 

	        	conn = getConnection();
				pstmt = conn.prepareStatement(sql);
	            
	            pstmt.setString(1, proDto.getPname()); 
	            pstmt.setInt(2, proDto.getPrice()); 
	            pstmt.setInt(3, proDto.getPsto());
	            pstmt.setInt(4, proDto.getProp()); 
	            pstmt.setString(5, proDto.getPic()); 
	            pstmt.setInt(6, proDto.getPno()); 
	            
	            result=pstmt.executeUpdate(); 
	             
	            if(result!=0){ 
	                return true; 
	            } 
	        }catch(Exception ex){ 
	            System.out.println("joinMember 에러: " + ex);             
	        }finally{ 
	            if(rs!=null) try{rs.close();}catch(SQLException ex){} 
	            if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){} 
	        } 
	         
	        return false; 
			
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
		public List<Product> selectPro(int pno) {
			List<Product> list = new ArrayList<>();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
					
			String sql = "select * from Product where pno=?";	
					try {
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, pno);
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
}
