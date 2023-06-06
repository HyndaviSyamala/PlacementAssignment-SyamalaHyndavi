package in.ineuron.daoFactory;

import in.ineuron.dao.IBlogPostDao;
import in.ineuron.dao.IBlogPostdaoImpl;

public class BlogPostDaoFactory {
     public static IBlogPostDao blogPostdao;
      public static IBlogPostDao getBlogPostdao() {
    	  blogPostdao=new IBlogPostdaoImpl();
    	  return blogPostdao;
      }
}
