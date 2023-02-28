package constructor;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		
		System.out.println("enter the first value");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		System.out.println("enter the second value");
		int b=s.nextInt();
		
		int c;
		c=a+b;
		System.out.println(c);
		

	}

}
