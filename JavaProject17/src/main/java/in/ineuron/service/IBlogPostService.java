package in.ineuron.service;

import java.util.*;
import in.ineuron.model.BlogPost;

public interface IBlogPostService {
     public String addBlog(BlogPost blogpost);
     public ArrayList<BlogPost> retrieveBlog();
     
}
