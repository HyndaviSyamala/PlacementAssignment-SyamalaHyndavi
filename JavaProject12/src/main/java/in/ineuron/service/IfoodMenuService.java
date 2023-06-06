package in.ineuron.service;

import in.ineuron.model.FoodMenu;

public interface IfoodMenuService {
       public String addFoodItem(String fooditem, int quantity, float price);
       public FoodMenu searchFoodItem(String fooditem);
       public String  updateFoodItem(FoodMenu foodMenu);
       public String deleteFoodItem(int sno);
}
