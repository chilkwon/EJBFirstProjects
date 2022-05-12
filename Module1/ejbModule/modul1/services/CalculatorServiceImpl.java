package modul1.services;

import javax.ejb.Stateless;

@Stateless
public class CalculatorServiceImpl implements CalculatorService {

	
	public int add(int a, int b) {		
		return a+b;
	}
	
	public int sub(int a, int b) {
		
		return a-b;
	}

	
	

}
