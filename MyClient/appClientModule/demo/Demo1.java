package demo;

import javax.naming.Context;

import modul1.services.HelloService;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context context = ClientUtility.getInitialContext();
			HelloService helloService = (HelloService) context.lookup("java:global/Module1/HelloServiceImpl!modul1.services.HelloService");
			System.out.println(helloService.hello());
			System.out.println(helloService.hi("ABC"));
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
