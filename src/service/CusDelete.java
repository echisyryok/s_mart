package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDao;

public class CusDelete implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("cno:"+request.getParameter("cno"));
		CustomerDao cusDao = CustomerDao.getInstance();
		cusDao.mDelete(Integer.parseInt(request.getParameter("cno")));
		
		return "Customer.CusData.do";
	}

}
