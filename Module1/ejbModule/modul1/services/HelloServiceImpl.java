package modul1.services;

import javax.ejb.Stateless;

@Stateless
public class HelloServiceImpl implements HelloService{

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

	@Override
	public String hi(String fullName) {
		// TODO Auto-generated method stub
		return "Hi"+ fullName;
	}

}
