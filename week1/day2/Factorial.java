package week1.day2;

public class Factorial {

	public static void main(String[] args) {
	
		int i = 5;
		int fact = 1;
		for (int i1 = i ; i1 >= 1 ; i1--) {
			fact = fact*i;
			System.out.println(fact);
		}
		System.out.println(fact);

	}

}