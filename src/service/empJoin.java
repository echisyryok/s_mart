package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Department;
import dao.Employee;
import dao.EmployeeDao;

public class EmpJoin implements CommandProcess {


	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
		EmployeeDao empDao = EmployeeDao.getInstance();
		List<Department> list = empDao.deptSelect();
		request.setAttribute("dept", list);
		return "Employee/empJoin.jsp";
	}

}
