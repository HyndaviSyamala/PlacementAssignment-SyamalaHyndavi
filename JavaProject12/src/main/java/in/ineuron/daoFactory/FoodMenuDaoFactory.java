package in.ineuron.daoFactory;

import in.ineuron.dao.IFoodMenuDao;
import in.ineuron.dao.IFoodMenuDaoImpl;

public class FoodMenuDaoFactory {
       private FoodMenuDaoFactory() {
    	   
       }
       private static IFoodMenuDao foodMenuDao=null;
       public static IFoodMenuDao getFoodMenuDao() {
    	   if(foodMenuDao==null) {
    	   foodMenuDao=new IFoodMenuDaoImpl();
       }
    	   return foodMenuDao;
       }
}
