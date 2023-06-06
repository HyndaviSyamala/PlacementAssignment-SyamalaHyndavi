package in.ineuron.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import in.ineuron.model.Menu;
import in.ineuron.util.JdbcUtil;

public class FoodMenuImpl implements FoodMenu {
	Connection con=null;
    PreparedStatement pst=null;
    Statement stmt=null;
    ResultSet res=null;
	@Override
	public ArrayList<Menu> showMenu() {
		String query="select sno,fooditem,quantity,price from FoodMenu";
		ArrayList<Menu> foodList=new ArrayList<Menu>();
		Menu foodMenu=new Menu();
		
		try {
			con = JdbcUtil.getJdbcConnection();
		if(con!=null) {
			stmt=con.createStatement();
			res=stmt.executeQuery(query);
		}
		
			
		if(res!=null) {
			while(res.next()) {
				
			     foodMenu.setSno(res.getInt(1));
			     foodMenu.setFoodItem(res.getString(2));
			     foodMenu.setQuantity(res.getInt(3));
			     foodMenu.setPrice(res.getFloat(4));
			    // System.out.println(foodMenu);
			     foodList.add(foodMenu);
			     //System.out.println(foodList);
			   
			}
			return foodList;
		}
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
