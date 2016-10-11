package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Customer;
import dao.CustomerDao;

public class CusModify implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("modify:"+1);
		Customer cusDto = new Customer();
		/*
    	1private String cpass;
    	2private String caddr;
    	3private String cphn;
    	4private String cdel;
    	5private String cmail;
    	6private String cid;
    	*/
		System.out.println("modify cid:"+request.getParameter("cid"));
		cusDto.setCpass(request.getParameter("cpass"));
		cusDto.setCaddr(request.getParameter("caddr"));
		cusDto.setCphn(request.getParameter("cphn"));
		cusDto.setCdel(request.getParameter("cdel"));
		cusDto.setCmail(request.getParameter("cmail"));
		cusDto.setCid(request.getParameter("cid"));
		CustomerDao cusDao = CustomerDao.getInstance();
		cusDao.modify(cusDto);
		System.out.println("modify:"+2);
		
		return "Customer.CusData.do";
	}

}
