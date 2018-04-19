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
@WebServlet("/Yes06")
public class Yes06 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		
		String yourName = request.getParameter("yourName");
		System.out.println(yourName);		
		String marry = "marry";		
		request.setAttribute("marry", marry);
		request.setAttribute("yourName", yourName);
				
		String[] movieNames = request.getParameterValues("seeMovie");
		request.setAttribute("movieNames", movieNames);
		
		String[] theImg = request.getParameterValues("theImg");
		request.setAttribute("theImg", theImg);
		
		RequestDispatcher dispacher = request.getRequestDispatcher("yes07.jsp");
		dispacher.include(request, response);
		
	
	}//doGet

}
