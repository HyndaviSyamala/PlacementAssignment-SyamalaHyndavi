package in.ineuron.serviceFactory;

import in.ineuron.dao.IBlogPostDao;
import in.ineuron.dao.IBlogPostdaoImpl;
import in.ineuron.service.IBlogPostService;
import in.ineuron.service.IBlogPostServiceImpl;

public class BlogPostServiceFactory {
	public static IBlogPostService blogPostservice;
    public static IBlogPostService getBlogPostservice() {
    	blogPostservice=new IBlogPostServiceImpl();
  	  return blogPostservice;
    }
}
