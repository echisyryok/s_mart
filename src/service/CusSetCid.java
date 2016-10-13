package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Customer;
import dao.CustomerDao;

public class CusSetCid implements CommandProcess {


	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
		
		CustomerDao cusDao = CustomerDao.getInstance();
		Customer cusDto = new Customer();
		
		cusDto=cusDao.getMember(request.getParameter("cid"));
		
		request.setAttribute("cno", cusDto.getCno());
		request.setAttribute("cid",cusDto.getCid());
		request.setAttribute("caddr", cusDto.getCaddr());
		request.setAttribute("cphn", cusDto.getCphn());
		request.setAttribute("cmail", cusDto.getCmail());
		request.setAttribute("cdel", cusDto.getCdel());
		request.setAttribute("cpass", cusDto.getCpass());
		
		return "Customer/cusModify.jsp";
	}

}
