package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Product;
import dao.ProductDao;

public class ProUpload implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
		Product proDto = new Product();
		System.out.println("pname:"+request.getParameter("pname"));
		System.out.println("price:"+request.getParameter("price"));
		System.out.println("psto:"+request.getParameter("psto"));
		System.out.println("prop:"+request.getParameter("prop"));
		proDto.setPname(request.getParameter("pname"));
		proDto.setPrice(Integer.parseInt(request.getParameter("price")));
		proDto.setPsto(Integer.parseInt(request.getParameter("psto")));
		proDto.setProp(Integer.parseInt(request.getParameter("prop")));
		proDto.setPic(request.getParameter("pic"));
		
		ProductDao proDao = ProductDao.getInstance();
		proDao.insert(proDto);
		return "Product.ItemList.do";
	}

}
