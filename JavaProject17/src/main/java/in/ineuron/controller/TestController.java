package in.ineuron.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.model.BlogPost;
import in.ineuron.service.IBlogPostService;
import in.ineuron.serviceFactory.BlogPostServiceFactory;

@WebServlet("/TestController/*")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request,response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IBlogPostService blogPost=BlogPostServiceFactory.getBlogPostservice();
		System.out.println("Request URI: "+request.getRequestURI());
	    System.out.println("Path Info: "+request.getPathInfo());
		if(request.getRequestURI().endsWith("addData")) {
			
			System.out.println("Path Info: "+request.getPathInfo());
			String title=request.getParameter("title");
			String description=request.getParameter("description");
			String content=request.getParameter("content");
			BlogPost blog=new BlogPost();
			blog.setTitle(title);
			blog.setDescription(description);
			blog.setContent(content);
			
			String status=blogPost.addBlog(blog);
			System.out.println(status);
			
			request.setAttribute("status", status);
			RequestDispatcher rd=request.getRequestDispatcher("../showblog.jsp");
			rd.forward(request, response);
		}
		
		
		if(request.getRequestURI().endsWith("showData")) {
			System.out.println("request reached here");
			ArrayList<BlogPost> blog=blogPost.retrieveBlog();
			System.out.println(blog);
			
			request.setAttribute("blog", blog);
			System.out.println(request.getAttribute("blog"));
			RequestDispatcher rd=request.getRequestDispatcher("../showAllPost.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request,response);
		
	}

}
