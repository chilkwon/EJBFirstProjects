package module2.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import module2.entities.Product;

@Stateless
public class ProductServiceImpl implements ProductService{


	public Product find() {
		// TODO Auto-generated method stub
		return new Product("p01","name 1",2);
	}

	
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("p01","name 1",20));
		products.add(new Product("p02","name 2",21));
		products.add(new Product("p03","name 3",22));
		
		return products;
	}

}
