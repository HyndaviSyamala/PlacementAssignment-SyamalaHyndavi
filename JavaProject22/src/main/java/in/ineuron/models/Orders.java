package in.ineuron.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "order_item")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	@Column(name="order_name")
	private String orderName;
	
	@Column(name="order_price")
	private int orderPrice;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderName=" + orderName + ", orderPrice=" + orderPrice + "]";
	}
	
	

}
