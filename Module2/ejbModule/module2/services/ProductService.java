package module2.services;

import java.util.List;

import javax.ejb.Remote;

import module2.entities.Product;

@Remote
public interface ProductService {
	
	public Product find();
	public List<Product> findAll();
	
}
