package in.ineuron.service;

import java.util.*;

import in.ineuron.dao.IBlogPostDao;
import in.ineuron.daoFactory.BlogPostDaoFactory;
import in.ineuron.model.BlogPost;

public class IBlogPostServiceImpl implements IBlogPostService {
     IBlogPostDao blogpostobj=BlogPostDaoFactory.getBlogPostdao();
	@Override
	public String addBlog(BlogPost blogpost) {
		return blogpostobj.addBlog(blogpost);
		
	}

	@Override
	public ArrayList<BlogPost> retrieveBlog() {
		
		return blogpostobj.retrieveBlog();
	}

}
