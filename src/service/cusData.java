package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Customer;
import dao.CustomerDao;
import dao.Employee;
import dao.EmployeeDao;

public class cusData implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		CustomerDao cusDao = CustomerDao.getInstance();
		//List<Employee> list = empDao.select(startRow, endRow);
		List<Customer> list = cusDao.select();
		request.setAttribute("list", list);
		return "Customer/cusData.jsp";
	}

}
