package week1.day1;

public class TwoWheeler {

	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 12345678901L;
	boolean isPunctured = false;
	String bikeName = "Splendor";
	double runningKM = 2657;


public static void main(String[] args) {
	
	TwoWheeler info = new TwoWheeler();
	System.out.println(info.noOfWheels);
	System.out.println(info.noOfMirrors);
	System.out.println(info.chassisNumber);
	System.out.println(info.isPunctured);
	System.out.println(info.bikeName);
	System.out.println(info.runningKM);
}
}	