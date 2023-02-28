package ArithmaticOperator;

public class LogicalOperator {

	public static void main(String[] args) {
		//logical Operator -- And(&&),Or(||),!(Expression)
		
		int a=20;
		int b=10;
		
		System.out.println(a>b && a<b);
		System.out.println(a>b && a>=b);
		System.out.println(a==b && a>b);
		System.out.println(a==b && a<=b);
		
		System.out.println(a>b || a>=b);
		System.out.println(a>b || a<b);
		System.out.println(a==b || a>b);
		System.out.println(a==b || a<=b);
		
		System.out.println(!(a>b));
		System.out.println(a>b);
		System.out.println(!(a<b));

	}

}
