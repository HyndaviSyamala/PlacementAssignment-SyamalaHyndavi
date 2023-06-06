package in.ineuron.model;

public class Menu {
	private static final long serialVersionUID=1L;
	private Integer sno;
	private String foodItem;
	private Integer quantity;
	private Float price;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Menu(Integer sno, String foodItem, Integer quantity, Float price) {
		super();
		this.sno = sno;
		this.foodItem = foodItem;
		this.quantity = quantity;
		this.price = price;
	}
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Menu [sno=" + sno + ", foodItem=" + foodItem + ", quantity=" + quantity + ", price=" + price + "]";
	}
    
}
