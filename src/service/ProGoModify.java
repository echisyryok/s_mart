package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProGoModify implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println(request.getAttribute("pno"));
		request.setAttribute("pno", request.getParameter("pno"));
		return "Product/ItemModify.jsp";
	}

}
