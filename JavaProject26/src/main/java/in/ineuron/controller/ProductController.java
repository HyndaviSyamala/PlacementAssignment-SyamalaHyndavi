package in.ineuron.controller;

import java.util.List;
import java.util.Optional;

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

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	
	@GetMapping("/home")
	public String home() {
		return "welcome to my home page";
	}
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		
			
		return productService.getProducts();
	}
	
	@GetMapping("/products/{productId}")
	public  Optional<Product> getProduct(@PathVariable String productId){
		
		System.out.println(productId);
				
		return productService.getProduct(Integer.parseInt(productId));
	}
	
	@PostMapping("/product/")
	public  Product addProduct(@RequestBody Product product){
		
				
		return productService.addProduct(product);
	}
	
	@PutMapping("/products")
	public  Product updateProduct(@RequestBody Product product){
			
		
		return productService.updateProduct(product);
	}


	@DeleteMapping("/products/{productId}")
	public  ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId){
		
		try {
			this.productService.deleteProduct(Integer.parseInt(productId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
		
	}
	
	
}
