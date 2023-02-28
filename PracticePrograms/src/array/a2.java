package array;

public class a2 {

	public static void main(String[] args) {
		
		// declaration
		// int[][] a;
		//int [][] a;
		//int[][]a;
		//int [] []a;
		//int a[][];
		
		//int[][] a;
		
		//creation
		
		// a=new int[3][4];
		
		// declaration + creation
		
		int[][] a=new int[3][4];
		
		// initialization
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][2]=40;

		// declaration + creation + initialization
		
		int[][] b= {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println(b[1][2]);
		System.out.println(b[2][2]);
	}

}
