package in.ineuron.dao;

import java.util.ArrayList;

import in.ineuron.model.BlogPost;

public interface IBlogPostDao {
	public String addBlog(BlogPost blogpost);
    public ArrayList<BlogPost> retrieveBlog();
}
