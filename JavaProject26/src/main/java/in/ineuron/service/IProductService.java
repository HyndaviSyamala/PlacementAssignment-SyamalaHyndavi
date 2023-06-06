package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.modal.Product;

public interface IProductService {
	
	

	List<Product> getProducts();

	Optional<Product> getProduct(Integer productId);

	Product addProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(Integer productId);
	
}
