package controller;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CommandProcess;
/*@WebServlet(urlPatterns="*.do",
	initParams={@WebInitParam(name="config",value="/WEB-INF/command.properties")})*/
@WebServlet(urlPatterns="*.do",
	initParams={@WebInitParam(name="config",value="/WEB-INF/command.properties")})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> commandMap = new HashMap<>();
	public void init(ServletConfig config) throws ServletException { 
	   	String props = config.getInitParameter("config");
	    // props = "/WEB-INF/command.properties";
	   	Properties pr = new Properties();
	    FileInputStream f = null; 
	    try {
	          String configFilePath = 
	         		config.getServletContext().getRealPath(props);
	          f = new FileInputStream(configFilePath);
	          pr.load(f);
	     } catch (IOException e) { throw new ServletException(e);
	     } finally {
	          if (f != null) try { f.close(); } catch(IOException ex) {}
	     }
	     Iterator<Object> keyIter = pr.keySet().iterator();
	     while( keyIter.hasNext() ) {
	          String command = (String)keyIter.next(); // message.do
	          String className = pr.getProperty(command); 
	          // className : service.Message
	          try {
	               Class<?> commandClass = Class.forName(className);
	               // commandClass는 service.Message클래스로 변경
	               Object commandInstance = commandClass.newInstance();
	               // commandInstanc는 service.Message의 객체 생성
	               commandMap.put(command, commandInstance);
	               // message.do, service.Message의 객체
	          } catch (Exception e) {
	               throw new ServletException(e);
	          }
	     }
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		String view = null;
	    CommandProcess com=null;
	    // http://localhost:8181/ch15/message.do
	    try { String command = request.getRequestURI();
	    // command : /ch15/message.do
	    // request.getContextPath() : /ch15
		      command = command.substring(
		    		 request.getContextPath().length()+1);
		// command : message.do
	          com = (CommandProcess)commandMap.get(command); 
	    // com : service.Message의 객체
	          view = com.requestPro(request, response);
	    // view : message.jsp
	    } catch(Throwable e) { throw new ServletException(e); } 
	    RequestDispatcher dispatcher =
	      	request.getRequestDispatcher(view);
	   dispatcher.forward(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8");
    		doGet(request, response);
	}
}