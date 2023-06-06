package in.ineuron.dao;

import in.ineuron.model.FoodMenu;

public interface IFoodMenuDao {
	public String addFoodItem(String fooditem, int quantity, float price);
    public FoodMenu searchFoodItem(String fooditem);
    public String  updateFoodItem(FoodMenu foodMenu);
    public String deleteFoodItem(int sno);
}
