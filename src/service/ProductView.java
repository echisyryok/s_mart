package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Product;
import dao.ProductDao;

public class ProductView implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		int pno = Integer.parseInt(request.getParameter("pno"));
	
		ProductDao proDao = ProductDao.getInstance();
		Product pro = proDao.proselect(pno);
		
		request.setAttribute("pro", pro);
		request.setAttribute("pno", pno);
		
		return "Product/productPage.jsp";
	}

}
