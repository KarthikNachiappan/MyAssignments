package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("2 args add");
	}
	
	public void add(int a, int b, int c) {
		System.out.println("3 args add");
	}
	
	public void sub(double a, double b) {
		System.out.println("2 args double sub");
	}
	
	public void sub(int a, int b) {
		System.out.println("2 args int sub");
	}
	
	public void mul(double a, double b) {
		System.out.println("2 args double mul");
	}
	
	public void mul(int a, double b) {
		System.out.println("2 args int/double mul");
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.add(2, 3);
		calc.add(3, 4, 5);
		calc.sub(10, 5);
		calc.sub(10.5, 5.5);
		calc.mul(3.2, 4.2);
		calc.mul(5, 6.2);
	}
	
}

