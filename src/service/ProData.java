package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Customer;
import dao.Product;
import dao.ProductDao;

public class ProData implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
		ProductDao proDao = ProductDao.getInstance();
		
		
		List<Product> list =proDao.select();
		request.setAttribute("list", list);
		return "Product/ItemList.jsp";
	}

}
