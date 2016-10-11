package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Department;
import dao.Employee;
import dao.EmployeeDao;

public class EmpModify implements CommandProcess {

	
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployeeDao empDao = EmployeeDao.getInstance();
		Employee emp = empDao.empselect(empno);
		List<Department> list = empDao.deptSelect();
		
		/*if (emp != null) empDao.updateHit(empno);*/

		request.setAttribute("dept", list);
		request.setAttribute("empno", empno);
		request.setAttribute("emp", emp);
		
		
		return "Employee/empModify.jsp";
	}

}
