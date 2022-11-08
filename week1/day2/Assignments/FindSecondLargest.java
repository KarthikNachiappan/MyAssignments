package week1.day2.Assignments;

//import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
	
			
		 int temp, size;
	      int data[] = {10, 20, 25, 63, 96, 57};
	      size = data.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(data[i]>data[j]){
	               temp = data[i];
	               data[i] = data[j];
	               data[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is "+data[size-2]);
	   }

	

}
