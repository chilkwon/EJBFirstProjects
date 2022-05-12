package demo;

import java.util.List;

import javax.naming.Context;


import module2.entities.Product;
import module2.services.ProductService;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context context = ClientUtility.getInitialContext();
			ProductService productService = (ProductService) context.lookup("java:global/Module2/ProductServiceImpl!module2.services.ProductService");
			List<Product> products = productService.findAll();
			products.stream().forEach(product-> System.out.println(product.getId()+":"+product.getName()+":"+product.getPrice()));
			
			
			
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
