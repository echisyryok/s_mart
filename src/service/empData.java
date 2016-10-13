package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Employee;
import dao.EmployeeDao;


public class EmpData implements CommandProcess {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		
				
		/*String pageNum = request.getParameter("pageNum");
		if (pageNum == null || pageNum.equals("")) 
			pageNum = "1";
		int currentPage = Integer.parseInt(pageNum);
		int rowPerPage  = 10;
		int pagePerBlk  = 10;	
	    int startRow    = (currentPage - 1) * rowPerPage + 1;
	    int endRow      = startRow + rowPerPage - 1;*/
		EmployeeDao empDao = EmployeeDao.getInstance();
		//List<Employee> list = empDao.select(startRow, endRow);
		List<Employee> list = empDao.select();
		/*int total   = empDao.total(); 
		int totalPage   = (int)Math.ceil((double)total/rowPerPage);
		int startPage=(currentPage - 1) / pagePerBlk * pagePerBlk + 1;
		int endPage = startPage + pagePerBlk - 	1;   
		if (endPage > totalPage) endPage = totalPage;
		int rowCnt  = total - startRow + 1;
		
		request.setAttribute("rowPerPage", rowPerPage);
		request.setAttribute("pagePerBlk", pagePerBlk);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("total", total);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("rowCnt", rowCnt);*/
	
		request.setAttribute("list", list);
		
		
		
		return "Employee/empData.jsp";
	}

}
