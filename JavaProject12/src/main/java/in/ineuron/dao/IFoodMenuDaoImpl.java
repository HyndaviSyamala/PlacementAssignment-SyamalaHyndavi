package in.ineuron.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.model.FoodMenu;
import in.ineuron.util.JdbcUtil;

public class IFoodMenuDaoImpl implements IFoodMenuDao {
	Connection con=null;
    PreparedStatement pst=null;
    ResultSet res=null;
    
	
	@Override
	public String addFoodItem(String fooditem, int quantity, float price)  {
		int rowsAffected=0;
		  String query="insert into FoodMenu(foodItem, quantity, price) values(?,?,?)";
		 try {
			 con = JdbcUtil.getJdbcConnection();
		  if(con!=null) {
			  pst=con.prepareStatement(query);
		  }
		  if(pst!=null) {
			  pst.setString(1, fooditem);
			  pst.setInt(2, quantity);
			  pst.setFloat(3, price);
			  rowsAffected= pst.executeUpdate();
		  }
		  if(rowsAffected==1) {
			  return "success";
		  }
		 }catch(SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return "failure";
	}

	@Override
	public FoodMenu searchFoodItem(String fooditem) {
		String query="select sno,fooditem,quantity,price from FoodMenu where fooditem=?";
		FoodMenu foodMenu=new FoodMenu();
		try {
			con = JdbcUtil.getJdbcConnection();
		if(con!=null) {
			pst=con.prepareStatement(query);
		}
		if(pst!=null) {
			pst.setString(1,fooditem);
			res=pst.executeQuery();
		}
		if(res!=null) {
			System.out.println(res);
			
			if(res.next()) {
				
			     foodMenu.setSno(res.getInt(1));
			     foodMenu.setFoodItem(res.getString(2));
			     foodMenu.setQuantity(res.getInt(3));
			     foodMenu.setPrice(res.getFloat(4));
			}
			
		}
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foodMenu;
	}

	@Override
	public String updateFoodItem(FoodMenu foodMenu) {
		String query="update FoodMenu set fooditem=?, quantity=?, price=? where sno=?" ;
		try {
			con = JdbcUtil.getJdbcConnection();
		   if(con!=null) {
			   pst=con.prepareStatement(query);
		   }
		   if(pst!=null) {
			   pst.setString(1, foodMenu.getFoodItem());
			   pst.setInt(2, foodMenu.getQuantity());
			   pst.setFloat(3, foodMenu.getPrice());
			   pst.setInt(4, foodMenu.getSno());
		   int rowAffected=pst.executeUpdate();
		   if(rowAffected==1) {
			   return "success";
		   }
		   }
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "failure";
	}

	@Override
	public String deleteFoodItem(int sno) {
		String query="delete * from foodMenu where sno=?";
		int rowAffected=0;
		try {
			con = JdbcUtil.getJdbcConnection();
	    if(con!=null) {
	    	pst=con.prepareStatement(query);
	    }
	    if(pst!=null) {
	    	pst.setInt(1, sno);
	    	
	    }
	    if(rowAffected==1) {
	    	return "success";
	    }
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "failure";
	}

}
