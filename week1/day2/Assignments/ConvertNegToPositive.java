package week1.day2.Assignments;

public class ConvertNegToPositive {

	public static void main(String[] args) {
		
		int i = -40;
		
		if (i < 0) {
			System.out.println(i+ ": Number is Negative");
			int j = i * (-1);
			System.out.println("Converted Positive number:" +j);
		}
		if (i > 0)
		 	System.out.println("Number is Positive or neutral");

	}

}
