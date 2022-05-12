package modul1.services;

import javax.ejb.Remote;

@Remote
public interface CalculatorService {

	public int add(int a,int b);
	public int sub(int a,int b);
	
}
