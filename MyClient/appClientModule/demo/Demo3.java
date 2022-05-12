package demo;

import javax.naming.Context;


import module2.entities.Product;
import module2.services.ProductService;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context context = ClientUtility.getInitialContext();
			ProductService productService = (ProductService) context.lookup("java:global/Module2/ProductServiceImpl!module2.services.ProductService");
			Product product = productService.find();
			System.out.println("Product Info");
			System.out.println("id:" + product.getId());
			System.out.println("name:" +product.getName());
			System.out.println("price: "+ product.getPrice());
			
			
			
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
