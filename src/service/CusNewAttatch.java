package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CusNewAttatch implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String chk = "no";
		session.setAttribute("chk", chk);
		return "Customer/cusJoin.jsp";
	}

}
