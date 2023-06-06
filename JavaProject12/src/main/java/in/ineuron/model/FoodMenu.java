package in.ineuron.model;

public class FoodMenu {
	private static final long serialVersionUID=1L;
	private Integer sno;
	private String foodItem;
	private Integer quantity;
	private Float price;
	public FoodMenu(Integer sno, String foodItem, Integer quantity, Float price) {
		super();
		this.sno = sno;
		this.foodItem = foodItem;
		this.quantity = quantity;
		this.price = price;
	}
	public FoodMenu() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodMenu [sno=" + sno + ", foodItem=" + foodItem + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
