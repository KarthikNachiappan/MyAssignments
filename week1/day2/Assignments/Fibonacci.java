package week1.day2.Assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int firstnum = 0;
		int secnum = 1;
		int range = 8;
		int sum,i;
		
		System.out.println(firstnum);
		System.out.println(secnum);
		
		for (i = 2; i<range; ++i) {
			sum = firstnum + secnum;
			System.out.println(sum);
			firstnum = secnum;
			secnum = sum;
					
		}		
						

	}
}
