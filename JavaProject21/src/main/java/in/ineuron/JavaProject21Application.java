package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.models.User;
import in.ineuron.service.IUserService;

@SpringBootApplication
public class JavaProject21Application {

	public static void main(String[] args) {
		System.out.println("hi this console based app");
		ApplicationContext factory = SpringApplication.run(JavaProject21Application.class, args);
		IUserService service = factory.getBean(IUserService.class);
		
		User user = new User();
		user.setName("hyndavi");
		user.setEmail("lakshmihyndavi643@gmail.com");
		user.setPassword("abdcdel");
		
		service.addUser(user);
		
		
		
		System.out.println("hi this console based app");
	}

}
