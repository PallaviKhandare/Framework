package practice;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
		
		int[]array= {a,b,c};
		int k;
		boolean first=true;
		
		for (int x=0;x<3;x++) {
			int y=array[x];
			int z=y+1;
		
			for(int i=1;i<=y;i++) {
				if(!first) {
					System.out.println();
				}
				first=false;
				System.out.format("%"+z+"s","");
				for(int j=1;j<=i;j++) {
					k=i;
					System.out.format("%"+1+"s","");
					System.out.println(k);
				}
				z--;
			}
		}
	}
}


