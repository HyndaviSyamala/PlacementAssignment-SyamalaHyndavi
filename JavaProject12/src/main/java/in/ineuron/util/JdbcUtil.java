package in.ineuron.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
  private JdbcUtil() {
	  
  }
  static {
	  
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	  }catch(ClassNotFoundException ce) {
 		 ce.printStackTrace();
 	 }
  }
  public static Connection getJdbcConnection() throws SQLException, Exception {
	  
	  String fileloc="D:\\Placement Assignment-Syamala Hyndavi\\Program-12\\src\\main\\java\\in\\ineuron\\util\\jdbcProperties.properties";
	   FileInputStream fis=new FileInputStream(fileloc);
	   Properties properties=new Properties();
	   properties.load(fis);
	   String url=properties.getProperty("url");
	   String username=properties.getProperty("user");
	   String password=properties.getProperty("password");
	  
	  
	  return DriverManager.getConnection(url,username,password);
  }
	
	
	
	
	
}
