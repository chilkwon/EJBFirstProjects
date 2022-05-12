package module2.services;

import java.util.List;
import module2.entities.Product;

public interface ProductService {
	
	public Product find();
	public List<Product> findAll();
	
}
