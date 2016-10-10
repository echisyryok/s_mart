package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
/*
1private int cno;
2private String cid;
3private String cpass;
4private String cname;
5private String caddr;
6private Date cbir;
7private String cphn;
8private String cdel;
9private String cmail;
10private Date cjoin;
11private Date cout;
12private String outchk;
13private int cgrd;
14private int cmil;
15private int cmils;*/

public class CustomerDao {
	private static CustomerDao instance;
	public static CustomerDao getInstance() {
		if (instance==null) {	instance = new CustomerDao();  	}
		return instance;
	}
	private CustomerDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MySql");
		conn = ds.getConnection();
		return conn;
	}
	//회원 가입 
    public boolean joinMember(Customer customer){ 
    	Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
        String sql="INSERT INTO CUSTOMER VALUES (select max(cno)+1 from customer,?,?,?,?,?,?,?,?)"; 
        int result=0; 
         
        try{ 

        	/*
        	1private String cid;
        	2private String cpass;
        	3private String cname;
        	4private String caddr;
        	5private Date cbir;
        	6private String cphn;
        	7private String cdel;
        	8private String cmail;
        	*/
        	conn = getConnection();
			pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, customer.getCid()); 
            pstmt.setString(2, customer.getCpass()); 
            pstmt.setString(3, customer.getCname()); 
            pstmt.setString(4, customer.getCaddr()); 
            pstmt.setDate(5, customer.getCbir()); 
            pstmt.setString(6, customer.getCphn());
            pstmt.setString(7, customer.getCdel()); 
            pstmt.setString(8, customer.getCmail()); 
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

	public List<Customer> select() {
		List<Customer> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from customer order by cno";	
			try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Customer cus = new Customer();
				cus.setCno(rs.getInt("cno"));
				cus.setCid(rs.getString("cid"));
				cus.setCpass(rs.getString("cpass"));
				cus.setCname(rs.getString("cname"));
				cus.setCaddr(rs.getString("caddr"));
				cus.setCbir(rs.getDate("cbir"));
				cus.setCphn(rs.getString("cphn"));
				cus.setCdel(rs.getString("cdel"));
				cus.setCmail(rs.getString("cmail"));
				cus.setCjoin(rs.getDate("cjoin"));
				cus.setCout(rs.getDate("cout"));
				cus.setOutchk(rs.getString("outchk"));
				cus.setCgrd(rs.getInt("cgrd"));
				cus.setCmil(rs.getInt("cmil"));
				cus.setCmils(rs.getInt("cmils"));
				list.add(cus);
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
