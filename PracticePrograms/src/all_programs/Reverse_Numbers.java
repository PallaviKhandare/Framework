package all_programs;

import java.util.Scanner;

public class Reverse_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
