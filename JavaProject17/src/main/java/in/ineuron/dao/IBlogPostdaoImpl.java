package in.ineuron.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import in.ineuron.model.BlogPost;
import in.ineuron.util.JdbcUtil;

public class IBlogPostdaoImpl implements IBlogPostDao {
	Connection con=null;
	PreparedStatement pst=null;
	Statement stmt=null;
	ResultSet res=null;
	@Override
	public String addBlog(BlogPost blogpost) {
		String query="insert into blogPost(title,description,content) values(?,?,?)";
		try {
			con=JdbcUtil.getJdbcConnection();
			if(con!=null) {
				pst=con.prepareStatement(query);
			}
			if(pst!=null) {
				pst.setString(1, blogpost.getTitle());
				pst.setString(2, blogpost.getDescription());
				pst.setString(3, blogpost.getContent());
				int rowAffected=pst.executeUpdate();
				if(rowAffected==1) {
					return "success";
				}
			}
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
		return "failure";
	}

	@Override
	public ArrayList<BlogPost> retrieveBlog() {
		String query="select * from blogpost";
		ArrayList<BlogPost> blogInfo=new ArrayList<BlogPost>();
		try {
			con=JdbcUtil.getJdbcConnection();
			if(con!=null) {
				stmt=con.createStatement();
				res=stmt.executeQuery(query);
				if(res!=null) {
					while(res.next()) {
						BlogPost blog=new BlogPost(res.getInt(1), res.getString(2), res.getString(3),res.getString(4));
					    blogInfo.add(blog);
					}
				}
			}
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
		return blogInfo;
	}

}
