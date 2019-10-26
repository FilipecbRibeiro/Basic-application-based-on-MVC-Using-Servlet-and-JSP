package org.ligth.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTheController
 */
@WebServlet("/ServletTheController")
public class ServletTheController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTheController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		ServletContext sc= getServletContext();
	//	
		PrintWriter out= response.getWriter();
		String paramt= request.getParameter("page");
		out.print("----> "+paramt);
	
		out.print(sc.getContextPath());
		
		if(paramt==null) {
			sc.getRequestDispatcher("/Home.jsp").forward(request, response);
		}else if(paramt.equals("Login.jsp")){
			sc.getRequestDispatcher("/Login.jsp").forward(request, response);
		}else if(paramt.equals("SignUp.jsp")) {
			sc.getRequestDispatcher("/SignUp.jsp").forward(request, response);
		}else if(paramt.equals("About.jsp")) {
			sc.getRequestDispatcher("/About.jsp").forward(request, response);
		}else
			sc.getRequestDispatcher("/Error.jsp").forward(request, response);
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
