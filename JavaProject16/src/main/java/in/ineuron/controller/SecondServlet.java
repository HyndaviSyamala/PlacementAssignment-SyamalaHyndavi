package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String desgn=request.getParameter("sdesign");
		String qualification=request.getParameter("squal");
		HttpSession session=request.getSession(false);
		session.setAttribute("sdesign", desgn);
		session.setAttribute("squal", qualification);
		RequestDispatcher reqdisp=request.getRequestDispatcher("./form3.html");
		reqdisp.forward(request, response);
	}

}
