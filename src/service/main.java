package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Main implements CommandProcess{

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		try {
			String checkdata = (String)session.getAttribute("chk");
			
			if(checkdata.equals("no")){
			String chk = null;
			session.setAttribute("chk", chk);
			}
		} catch (Exception e) {
			
		}finally {
			return "Main/main.jsp";
		}
		
		
		
		
		
	}

}
