package yes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ComicVo;

@WebServlet("/Yes10")
public class Yes10 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		
		String[] movieNames = request.getParameterValues("seeMovie");
		request.setAttribute("movieNames", movieNames);
		
		
		List<String> tempMapList = new ArrayList<>();
		ComicVo theData = null;
		String movieName = null; String year = null ; String img = null;
		
		for(int j=0; j<100; j++) {
		theData = new ComicVo(movieName,year,img);
		theData.setName(movieName);
		theData.setName(year);
		theData.setName(img);
		
		tempMapList.add(theData);
	}
		
		
		request.setAttribute("tempMapList", tempMapList);//把資料都裝近來
		
		
				
//		for (int i = 0; i < movieNames.length; i++) {
//		    System.out.println("A_Jump.java:movieName:" + movieNames[i].toString()); 
//		}//for 這裡只是程式console除錯看的
		
		
		

		RequestDispatcher dispacher = request.getRequestDispatcher("yes11.jsp");
		dispacher.include(request, response);
		
	
	}//doGet
	

}//servlet
