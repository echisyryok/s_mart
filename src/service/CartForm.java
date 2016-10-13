package service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Cart;
import dao.CartDao;
import dao.Employee;
import dao.EmployeeDao;
import dao.Product;
import dao.ProductDao;

public class CartForm implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
		}
		
		int pno = Integer.parseInt(request.getParameter("pno"));
			
		ProductDao proDao = ProductDao.getInstance();		
		List<Product> list = proDao.selectPro(pno);
		
		emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
		emp.setEpass(request.getParameter("epass"));
		emp.setEname(request.getParameter("ename"));
		emp.setSal(Integer.parseInt(request.getParameter("sal")));
		emp.setDno(Integer.parseInt(request.getParameter("dno")));
		emp.setEcarr(Integer.parseInt(request.getParameter("ecarr")));
		emp.setRank(Integer.parseInt(request.getParameter("rank")));
		
		EmployeeDao empDao = EmployeeDao.getInstance();
		  = empDao.insert(emp);

		  ctno
		  pname
		  pno
		  price
		  pget
		  cin
 
		  pno
		  pname
		  price
		  psto
		  prop
		  pre
		  pco
		  pic

		  
		  
		request.setAttribute("result", result);
		Cart cart = new Cart(); 
		
		CartDao ctDao = CartDao.getInstance();
		
		
		int result = ctDao.cartInput(cart);
		List<Cart> = cartDeck.
		
		request.setAttribute("list", list);
		request.setAttribute("pno", pno);
						
		return "Cart/cartForm.jsp";
	}

}
