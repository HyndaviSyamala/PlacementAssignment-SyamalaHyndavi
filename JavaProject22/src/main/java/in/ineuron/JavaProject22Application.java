package in.ineuron;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.models.Orders;
import in.ineuron.models.User;
import in.ineuron.service.IOrderService;
import in.ineuron.service.IUserService;

@SpringBootApplication
public class JavaProject22Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(JavaProject22Application.class, args);

		IOrderService orderService = factory.getBean(IOrderService.class);
		IUserService service = factory.getBean(IUserService.class);

		User user = new User();
		user.setName("hyndavi");
		user.setEmail("lakshmihyndavi643@gmail.com");
		user.setPassword("abdcdel");

		

		Orders order = new Orders();

		order.setOrderName("laptop");
		order.setOrderPrice(25000);

		Orders order2 = new Orders();

		order2.setOrderName("computer");
		order2.setOrderPrice(28000);

		Orders order3 = new Orders();

		order3.setOrderName("mobile");
		order3.setOrderPrice(85000);
		
		List<Orders> list = new ArrayList();
		
		list.add(order);
		list.add(order2);
		list.add(order3);
		
		user.setOrder(list);
		
		service.addUser(user);
		
		

		System.out.println("hi this console based app");

	}

}
