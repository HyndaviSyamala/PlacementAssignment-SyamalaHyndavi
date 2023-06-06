package in.ineuron.service;

import in.ineuron.dao.IFoodMenuDao;
import in.ineuron.daoFactory.FoodMenuDaoFactory;
import in.ineuron.model.FoodMenu;

public class IFoodMenuServiceImpl implements IfoodMenuService {
	 
	 public IFoodMenuDao foodMenuDao;
      
	 
      
	@Override
	public String addFoodItem(String fooditem, int quantity, float price) {
		foodMenuDao=FoodMenuDaoFactory.getFoodMenuDao();
		return foodMenuDao.addFoodItem(fooditem, quantity, price);
	}

	@Override
	public FoodMenu searchFoodItem(String fooditem) {
		foodMenuDao=FoodMenuDaoFactory.getFoodMenuDao();
		return foodMenuDao.searchFoodItem(fooditem);
	}

	@Override
	public String updateFoodItem(FoodMenu foodMenu) {
		foodMenuDao=FoodMenuDaoFactory.getFoodMenuDao();
		return foodMenuDao.updateFoodItem(foodMenu);
	}

	@Override
	public String deleteFoodItem(int sno) {
		foodMenuDao=FoodMenuDaoFactory.getFoodMenuDao();
		return foodMenuDao.deleteFoodItem(sno);
	}

}
