package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.EmployeeDao;

public class EmpnoChk implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		int empno= Integer.parseInt(request.getParameter("empno"));
		
		EmployeeDao empDao = EmployeeDao.getInstance();
		int empnochk = empDao.empnochk(empno);
		
		request.setAttribute("empchk", empnochk);
		request.setAttribute("empno", empno);
		
		
		return "Employee/empnoChk.jsp";
	}

}
