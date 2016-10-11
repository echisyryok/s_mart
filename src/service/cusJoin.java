package service;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Customer;
import dao.CustomerDao;

public class CusJoin implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
		}
		Customer cusDto = new Customer();
		System.out.println("1");
		/*
    	1private String cid;
    	2private String cpass;
    	3private String cname;
    	4private String caddr;
    	5private Date cbir;
    	6private String cphn;
    	7private String cdel;
    	8private String cmail;
    	*/
		cusDto.setCid(request.getParameter("cid"));
		cusDto.setCpass(request.getParameter("cpass"));
		cusDto.setCname(request.getParameter("cname"));
		cusDto.setCaddr(request.getParameter("caddr"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		 Date date = null;
		 try {
		 date = sdf.parse(request.getParameter("year")+"/"+request.getParameter("month")+"/"+request.getParameter("day"));
		 //입력받은 년,월,일을 date 포맷으로 변경
		 } catch (ParseException e) {
		 e.printStackTrace();
		 }
		cusDto.setCbir((java.sql.Date) date);
		cusDto.setCphn(request.getParameter("cphn"));
		cusDto.setCdel(request.getParameter("cdel"));
		cusDto.setCmail(request.getParameter("cmail"));
		System.out.println("2");
		CustomerDao cusDao = CustomerDao.getInstance();
		cusDao.joinMember(cusDto);
		System.out.println("3");
		return "Customer/CusData.jsp";
	}

}
