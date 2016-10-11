package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Product;
import dao.ProductDao;

public class ProductMainData implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		int prop = Integer.parseInt(request.getParameter("prop"));
			
		ProductDao proDao = ProductDao.getInstance();
				
		//List<Employee> list = empDao.select(startRow, endRow);
		List<Product> list = proDao.select(prop);
		request.setAttribute("list", list);
		request.setAttribute("prop", prop);
		return "Product/productMain.jsp";
	}

}
