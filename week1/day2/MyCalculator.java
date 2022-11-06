package week1.day2;

import week1.day1.*;

public class MyCalculator {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int sum = cal.add(20,40, 60);
		int sub = cal.sub(40, 20);
		double mul = cal.Mul(5, 5);
		float div = cal.div(50, 5);
		
		System.out.println("Add:" +sum);
		System.out.println("sub:" +sub);
		System.out.println("mul:" +mul);
		System.out.println("div:" +div);
		
	

	}

}
