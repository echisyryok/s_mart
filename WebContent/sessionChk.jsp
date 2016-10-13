<%
	// session.setAttribute("id", id);
	
	String cid = (String)session.getAttribute("cid");
	String empno = (String)session.getAttribute("empno");
	if(cid == null || cid.equals("")){
		response.sendRedirect("Main.main.do");
		return;
	}else if(empno == null || empno.equals("")){
		response.sendRedirect("Main.main.do");
		return;
	}
	
%>
