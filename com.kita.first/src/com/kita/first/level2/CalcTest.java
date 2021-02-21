package com.kita.first.level2;

public class CalcTest {
	public static void main(String[] args) {
		Calc.powerOn();

		int result1 = Calc.sum(1, 2);
		System.out.println("result1 : " + result1);

		int result2 = Calc.minus(1, 2);
		System.out.println("result2 : " + result2);

		int result3 = Calc.multiply(1, 2);
		System.out.println("result3 : " + result3);

		double result4 = Calc.divide(1, 2);
		System.out.println("restul4 : " + result4);

		double result5 = Calc.sum(1.5, 3.4);
		System.out.println("result5 : " + result5);

		int result6 = Calc.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
		System.out.println("result6 : "+result6);
		
		Calc.powerOff();
	}
}
