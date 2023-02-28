package ArithmaticOperator;

public class Fibonacciseries3 {

	public static void main(String[] args) {
	 int i=1,n=10,f=0,s=1;
	 System.out.println("Fibonacci series till"+n+"terms:");
	 
	 while(i<=n) {
		 System.out.print(f+",");
		 
		 int c=f+s;
		 f=s;
		 s=c;
		 
		 i++;
	 }

	}

}
