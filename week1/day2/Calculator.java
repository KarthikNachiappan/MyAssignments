package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println(result);
		return result;
	
	} 
	
	public int sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
		return result;
	
	} 
	
	public double Mul(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(result);
		return result;
	
	} 
 
	public float div(float num1, float num2) {
		float result = num1 / num2;
		System.out.println(result);
		return result;
	
	}
	
	//public static void main(String[] args) {
		//Calculator ops = new Calculator();
		//ops.add(20,40,60);
		//ops.sub(40,20);
		//ops.Mul(5,5);
		//ops.div(50,5);
		
	//}
	
	
}
