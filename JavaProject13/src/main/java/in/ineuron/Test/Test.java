package in.ineuron.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import in.ineuron.util.JdbcUtil;

public class Test {

	public static void main(String[] args) {
		Connection con=null;
		
		PreparedStatement pstmt=null;
		String query="INSERT INTO Student(Name, Age)VALUES ( ?, ?)";
		
		String filepath="D:\\Placement Assignment-Syamala Hyndavi\\Program-13\\src\\main\\java\\in\\ineuron\\util\\data.csv";
		try {
			
			con=JdbcUtil.getJdbcConnection();
			con.setAutoCommit(false);
			if(con!=null) {
				System.out.println("connection established");
				pstmt=con.prepareStatement(query);
				BufferedReader lineReader=new BufferedReader(new FileReader(filepath));
				String lineText=null;
				
				lineReader.readLine();
	            while ((lineText=lineReader.readLine())!=null){
	                String[] data=lineText.split(",");

	                String name=data[0];
	                String age=data[1];
	                
	                pstmt.setString(1, name);
	                pstmt.setInt(2, Integer.parseInt(age));
			
			       pstmt.addBatch();
			       
	            }
	            if(pstmt!=null) {
	            	int[] updateCounts = pstmt.executeBatch();
	            	if(updateCounts.length!=0) {
	            		System.out.println("Data inserted successfully");
	            	}
	            }
	            
	            
			}else {
				System.out.println("Connection not established");
			}
			
			con.commit();
            con.close();
            
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
