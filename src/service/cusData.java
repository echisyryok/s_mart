package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Customer;
import dao.CustomerDao;

public class CusData implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("1");
		CustomerDao cusDao = CustomerDao.getInstance();
		//List<Employee> list = empDao.select(startRow, endRow);
		List<Customer> list = cusDao.select();
		request.setAttribute("list", list);
		System.out.println("2");
		return "Customer/cusData.jsp";
	}

}
