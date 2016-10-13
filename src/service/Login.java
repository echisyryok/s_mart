package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import dao.Customer;
import dao.CustomerDao;
import dao.Employee;
import dao.EmployeeDao;

public class Login implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String chk = request.getParameter("chk");
		String pass = request.getParameter("pass");

		
		System.out.println("id : "+id);
		System.out.println("chk : "+chk);
		System.out.println("pass : "+pass);
		
		EmployeeDao empDao = EmployeeDao.getInstance();
		CustomerDao cusDao = CustomerDao.getInstance();
		
		List<Employee> emp = empDao.selectList();
		List<Customer> cus = cusDao.select();
		
		HttpSession session = request.getSession();
		int result = 0;

		if (chk.equals("c")) {
			result = cusDao.idCheck(id, pass);
			System.out.println("result : "+result);
			
			if (result == 1) {
				session.setAttribute("id", id);
			
				session.setAttribute("chk", chk);
				session.setAttribute("cus", cus);
				
				return "Main.main.do";
			} else if (result == 0) {
				session.setAttribute("id", id);
				chk = "no";
				session.setAttribute("chk", chk);
				session.setAttribute("msg", "비밀번호가 일치 하지 않습니다");
				return "Login/login.jsp";
			} else if (result == -1) {
				session.setAttribute("id", id);
				chk = "no";
				session.setAttribute("chk", chk);
				session.setAttribute("msg", "아이디가 존재 하지 않습니다");
				return "Login/login.jsp";

			}
		}

		else if (chk.equals("e")) {
			result = empDao.idCheck(id, pass);
			if (result == 1) {
				session.setAttribute("id", id);
			
				session.setAttribute("chk", chk);
				session.setAttribute("emp", emp);
				return "Main.main.do";
			} else if (result == 0) {
				session.setAttribute("id", id);
				chk = "no";
				session.setAttribute("chk", chk);
				session.setAttribute("msg", "비밀번호가 일치 하지 않습니다");
				return "Login/login.jsp";
			} else if (result == -1) {
				session.setAttribute("id", id);
				chk = "no";
				session.setAttribute("chk", chk);
				session.setAttribute("msg", "아이디가 존재 하지 않습니다");
				return "Login/login.jsp";
			}		
		}


		return "Login/login.jsp";
	}

}
