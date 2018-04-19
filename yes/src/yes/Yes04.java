package yes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Yes04
 */
@WebServlet("/Yes04")
public class Yes04 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		
//		String movieNames = request.getParameter("movieNames");
//		System.out.println(movieNames);
		
		String yourName = request.getParameter("yourName");
		System.out.println(yourName);
				
		
		String marry = "marry";		
		
//		request.setAttribute("movieNames", movieNames);
		request.setAttribute("marry", marry);
		request.setAttribute("yourName", yourName);
		

		//String[] movieNames = request.getParameterValues("seeMovie");
		//for (int i = 0; i < movieNames.length; i++) {
		//    System.out.println("A_Jump.java:movieName:" + movieNames[i].toString()); 
		//}//for 這裡只是程式console除錯看的
		//此session要給下一頁用的
		//HttpSession session = request.getSession();
		//session.setAttribute("movieName", movieNames);

		
		String[] movieNames = request.getParameterValues("seeMovie");
		request.setAttribute("movieNames", movieNames);
		
		RequestDispatcher dispacher = request.getRequestDispatcher("yes05.jsp");
		dispacher.include(request, response);
		
	
	}//doGet

}
