package in.ineuron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.modal.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
