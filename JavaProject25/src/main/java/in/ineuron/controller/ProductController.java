package in.ineuron.controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.modal.Product;
import in.ineuron.service.IProductService;
import lombok.extern.slf4j.Slf4j;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	//Logger logger = (Logger) LoggerFactory.getLogger(ProductController.class);
	@GetMapping("/home")
	public String home() {
		return "welcome to my home page";
	}
	
	
	@PostMapping("/product/")
	public  Product addProduct(@RequestBody Product product){
		
		//log.info("received request for add products");
		//logger.info("this is logger");
		
		return productService.addProduct(product);
	}
	
	



	
	
}
