package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Product;
import dao.ProductDao;

public class ProModify implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
		Product proDto = new Product();
		System.out.println(1);
		proDto.setPno(Integer.parseInt(request.getParameter("pno")));
		proDto.setPname(request.getParameter("pname"));
		proDto.setPrice(Integer.parseInt(request.getParameter("price")));
		proDto.setPsto(Integer.parseInt(request.getParameter("psto")));
		proDto.setProp(Integer.parseInt(request.getParameter("prop")));
		proDto.setPic(request.getParameter("pic"));
		ProductDao proDao = ProductDao.getInstance();
		
		proDao.modify(proDto);
		System.out.println(2);

		return "Product.ItemList.do";
	}

}
