package in.ineuron.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestApp() {
        // TODO Auto-generated constructor stub
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	
	}
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
		   PrintWriter out=response.getWriter();
		   out.println("<h1 style='color:green; text-align:center;'> Welcome "+request.getParameter("fullname")+"</h1>");
		   
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

}
