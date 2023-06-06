package in.ineuron.Main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.ineuron.util.JdbcUtil;

public class GetAllData {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet res=null;
		
		try {
			con=JdbcUtil.getJdbcConnection();
			String query="select * from FoodMenu";
			
			if(con!=null) {
			 stmt=con.createStatement();
				
			}if(stmt!=null) {
				res=stmt.executeQuery(query);
			}
			if(res!=null) {
				System.out.println("sno\tFood Item\tQuantity\tPrice");
			 while(res.next()) {
				 System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t\t"+res.getInt(3)+"\t\t"+res.getFloat(4));
			 }
			}else {
				System.out.println("No record found");
			}
		}catch ( Exception e) {
			e.printStackTrace();
		} 
                                                                                                                                                                                                                                                                            
	}

}
