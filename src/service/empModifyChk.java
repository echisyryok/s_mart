package service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employee;
import dao.EmployeeDao;

public class EmpModifyChk implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
		}
			
		Employee emp = new Employee();
		
		emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
		emp.setEpass(request.getParameter("epass"));
		emp.setEname(request.getParameter("ename"));
		emp.setSal(Integer.parseInt(request.getParameter("sal")));
		emp.setDno(Integer.parseInt(request.getParameter("dno")));
		emp.setEcarr(Integer.parseInt(request.getParameter("ecarr")));
		emp.setRank(Integer.parseInt(request.getParameter("rank")));
		
		EmployeeDao empDao = EmployeeDao.getInstance();
		int result  = empDao.update(emp);
		
		request.setAttribute("result", result);
			
		return "Employee/empModifyConfirm.jsp";
	}

}
