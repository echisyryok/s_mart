package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CusSetCid implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("cid:"+request.getParameter("cid"));
		request.setAttribute("cid", request.getParameter("cid"));
		
		return "Customer/CusModify.jsp";
	}

}
