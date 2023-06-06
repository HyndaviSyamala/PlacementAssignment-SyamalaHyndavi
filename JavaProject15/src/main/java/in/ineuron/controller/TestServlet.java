package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.Dao.FoodMenu;
import in.ineuron.Dao.FoodMenuImpl;
import in.ineuron.model.Menu;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FoodMenu foodmenu=new FoodMenuImpl();
		ArrayList<Menu> foodList=foodmenu.showMenu();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		if(foodList!=null) {
    		out.println("<h1 style='color:green; text-align:center;'>Food Menu</h1>");
    		out.println("<body><center>");
    		
    		out.println("<table border='1'>");
    		out.println("<tr><th>SNO</th><th>FOOD ITEM</th><th>QUANTITY</th><th>PRICE</th></tr>");
    		for(Menu list:foodList) {
    		out.println("<tr><td>"+list.getSno()+"</td><td>"+list.getFoodItem()+"</td><td>"+list.getQuantity()+"</td><td>"+list.getPrice()+"</td></tr>");
    		 }
    		out.println("</table></center></body>");
    		
    	}else {
    		out.println("<h1 style='color:green; text-align:center;'>No Food ITEMS AvAILABLE</h1>");
    	}
	}

}
