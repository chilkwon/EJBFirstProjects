package demo;

import javax.naming.Context;

import modul1.services.CalculatorService;


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context context = ClientUtility.getInitialContext();
			CalculatorService calculatorService = (CalculatorService) context.lookup("java:global/Module1/CalculatorServiceImpl!modul1.services.CalculatorService");
			System.out.println("Add: "+ calculatorService.add(1, 2));
			System.out.println("Sub: " + calculatorService.sub(1, 2));
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
