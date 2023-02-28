package Practice;

import java.util.Arrays;

public class Merging_Array {

	public static void main(String[] args) {
		 int src1[]= {10,20,30,40,50};
		 int src2[]= {9,18,27,36,45};
		 
		 int newArray[]=new int[src1.length+src2.length];

		 System.arraycopy(src1, 0, newArray, 0, src1.length);
		System.arraycopy(src2, 0, newArray, src1.length, src2.length);
		// Arrays.sort(newArray);
		System.out.println("Array1="+Arrays.toString(src1));
		 System.out.println("Array2="+Arrays.toString(src2));
		 System.out.println("Merged Array="+Arrays.toString(newArray));
		 
		 }

	}


