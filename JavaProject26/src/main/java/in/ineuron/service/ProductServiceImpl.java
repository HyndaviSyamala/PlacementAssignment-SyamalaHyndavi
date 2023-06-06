package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.modal.Product;
import in.ineuron.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {
	
	//List<Product> list;
	
	@Autowired
	private IProductRepository productRepository;
	
	
	
	@Override
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProduct(Integer productId) {
		
		System.out.println(productRepository.findById(productId));
		
		return productRepository.findById(productId);
		
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		 return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer productId) {
		
		Product prod = productRepository.getReferenceById(productId);
		productRepository.delete(prod);
		
	}

}
