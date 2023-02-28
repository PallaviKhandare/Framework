package ArithmaticOperator;

public class Fibonacciseries2 {

	public static void main(String[] args) {
		int n=50,f=0,s=1;
		System.out.println("Fibonacci series upto"+n+":");
		
		while(f<=n) {
			System.out.println(f+",");
			
			int c=f+s;
				f=s;
				s=c;

		}

	}

}
