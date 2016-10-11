package service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employee;
import dao.EmployeeDao;

public class EmpDel implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
		int empno =Integer.parseInt(request.getParameter("empno"));
		EmployeeDao empDao = EmployeeDao.getInstance();
		int result  = empDao.delete(empno);
				
		request.setAttribute("result", result);
					
		return "Employee/empDeleteConfirm.jsp";
	}

}
