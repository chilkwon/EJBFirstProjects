package modul1.services;

import javax.ejb.Remote;

@Remote
public interface HelloService {
	
	public String hello();
	public String hi(String fullName);
	

}
