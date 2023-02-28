package ArithmaticOperator;

public class LogicalOperator {

	public static void main(String[] args) {
		// logical Operator --> And(&&),OR(||),Expression(!)
		
		int a=30;
		int b=20;
		
		System.out.println(a>b && a>=b);//T
		System.out.println(a>b && a<b);//F
		System.out.println(a==b && a>b);//F
		System.out.println(a==b && a<=b);//F
		
		System.out.println(a>b || a>=b);//T
		System.out.println(a>b || a<b);//T
		System.out.println(a==b || a>b);//T
		System.out.println(a==b || a<=b);//F
		
		System.out.println(!(a>b));//F
		System.out.println(a>b);//T
		System.out.println(!(a==b));//T

	}

}
