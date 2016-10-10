package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class EmployeeDao {
	private static EmployeeDao instance;
	public static EmployeeDao getInstance() {
		if (instance==null) {	instance = new EmployeeDao();  	}
		return instance;
	}
	private EmployeeDao() {}    
	private Connection getConnection() throws Exception {
		Connection conn=null; 	 
		Context init = new InitialContext();
		DataSource ds = 
				(DataSource)init.lookup("java:comp/env/jdbc/MySql");
		conn = ds.getConnection();
		return conn;
	}
	
	public List<Employee> select(int startRow, int endRow) {
		List<Employee> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		/*String sql = "select * from Employee order by empno"
				+ " limit startRow, 10(rowPerPage);";	*/
		String sql = "select * from Employee";	
				try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEpass(rs.getString("epass"));
				emp.setEname(rs.getString("ename"));
				emp.setSal(rs.getInt("sal"));
				emp.setDno(rs.getInt("dno"));
				emp.setEcarr(rs.getInt("ecarr"));
				emp.setRank(rs.getInt("rank"));
				
				list.add(emp);
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
	
	public int total() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int total = 0;
		String sql = "select count(*) from Employee";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				total = rs.getInt(1);
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
		return total;
	}
	public List<Employee> select() {
		List<Employee> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		/*String sql = "select * from Employee order by empno"
				+ " limit startRow, 10(rowPerPage);";	*/
		String sql = "select * from Employee order by empno";	
				try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEpass(rs.getString("epass"));
				emp.setEname(rs.getString("ename"));
				emp.setSal(rs.getInt("sal"));
				emp.setDno(rs.getInt("dno"));
				emp.setEcarr(rs.getInt("ecarr"));
				emp.setRank(rs.getInt("rank"));
				
				list.add(emp);
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
	public List<Department> deptSelect() {
		List<Department> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
		String sql = "select * from Department";	
				try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Department dept = new Department();
				dept.setDno(rs.getInt("dno"));
				dept.setDname(rs.getString("dname"));
				dept.setDbon(rs.getInt("dbon"));
				
				list.add(dept);
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
	public int empnochk(int empno) {
		int result=0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	
		String sql = "select * from Employee where empno = ?";	
				try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			if (rs.next())
				result = 1;
			else
				result = 0;
			
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
		return result;
	}
	public int insert(Employee emp) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into Employee values (?,?,?,?,?,?,?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, emp.getEmpno());
			pstmt.setString(2, emp.getEpass());
			pstmt.setString(3, emp.getEname());
			pstmt.setInt(4, emp.getSal());
			pstmt.setInt(5, emp.getDno());
			pstmt.setInt(6, emp.getEcarr());
			pstmt.setInt(7, emp.getRank());
					
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
	public Employee empselect(int empno) {
		Employee emp = new Employee();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from Employee where empno=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				emp.setEmpno(rs.getInt("empno"));
				emp.setEpass(rs.getString("epass"));
				emp.setEname(rs.getString("ename"));
				emp.setSal(rs.getInt("sal"));
				emp.setDno(rs.getInt("dno"));
				emp.setEcarr(rs.getInt("ecarr"));
				emp.setRank(rs.getInt("rank"));
				
			} else
				emp = null;
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
		return emp;
		
	}
	public void updateHit(int empno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "update Employee set readcount = readcount + 1 " + " where empno=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.executeUpdate();
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
		
	}
	public int update(Employee emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "update Employee set epass=?,ename=?,sal=?,dno=?,ecarr=?,rank=? where empno=?";
		

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emp.getEpass());
			pstmt.setString(2, emp.getEname());
			pstmt.setInt(3, emp.getSal());
			pstmt.setInt(4, emp.getDno());
			pstmt.setInt(5, emp.getEcarr());
			pstmt.setInt(6, emp.getRank());
			pstmt.setInt(7, emp.getEmpno());
			
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
	
	public int delete(int empno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql="delete from Employee where empno=?";
		//String sql = "update Employee set delYn='y' where empno=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
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

