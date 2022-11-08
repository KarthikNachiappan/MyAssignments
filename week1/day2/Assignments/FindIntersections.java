package week1.day2.Assignments;

import java.util.Iterator;

public class FindIntersections {

	public static void main(String[] args) {
		
		int a[] = {3,2,11,4,6,7};
		
		int b[] = {1,2,8,4,9,7};
		int temp, sizeA, sizeB;
		
		sizeA = a.length;
		sizeB = b.length;
		
		for (int i = 0; i < sizeA; i++){
			for (int j = 0; j < sizeB; j++) {
				if (a[i] == b[j]) {
					temp = a[i];
				    System.out.println("Intersection nos: "+temp);
				}
		}
		}

	}

}
