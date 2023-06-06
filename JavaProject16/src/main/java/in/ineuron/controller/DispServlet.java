package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/disp")
public class DispServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String mobile=request.getParameter("smobile");
			String email=request.getParameter("semail");
			HttpSession session=request.getSession(false);
			session.setAttribute("smobile", mobile);
			session.setAttribute("semail", email);
			out.println("<html>");
			out.println("<body bgcolor='lightblue'>");
			out.println("<center>");
			out.println("<h1 style='color:red; text-align:center;'>Registration Details...</h1>");
			out.println("<table border='1'>");
			out.println("<tr><th>Name</th><th>Value</th></tr>");
			Enumeration<String> parametervalues=session.getAttributeNames();
			while(parametervalues.hasMoreElements()) {
				String parametername=parametervalues.nextElement();
				String parametervalue=(String) session.getAttribute(parametername);
				out.println("<tr><td>"+parametername+"</td><td>"+parametervalue+"</td></tr>");
				
			}
			out.println("</table>");
			out.println("</center>");
			out.println("</body></html>");
			out.println();
			System.out.println("Session id used is :: "+request.getRequestedSessionId());
			
	}

}
