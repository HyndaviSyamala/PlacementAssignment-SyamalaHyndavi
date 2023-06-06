package in.ineuron.serviceFactory;


import in.ineuron.service.IFoodMenuServiceImpl;
import in.ineuron.service.IfoodMenuService;

public class FoodMenuServiceFactory {
	private FoodMenuServiceFactory() {
 	   
    }
    private static IfoodMenuService foodMenuService=null;
    public static IfoodMenuService getFoodMenuService() {
 	   if(foodMenuService==null) {
 		  foodMenuService=new IFoodMenuServiceImpl();
    }
 	   return foodMenuService;
    }
}
