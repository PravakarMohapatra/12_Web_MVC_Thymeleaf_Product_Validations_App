package in.pravakar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pravakar.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
