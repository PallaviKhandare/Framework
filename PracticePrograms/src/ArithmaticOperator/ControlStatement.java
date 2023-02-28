package ArithmaticOperator;

public class ControlStatement {

	public static void main(String[] args) {
		
		int a=10;
		int b=6;
		
		//if Statement
		
		if(a+b>15) {
			System.out.println("True");
		}
		
		//if--else
		
		if(a+b<15) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		//if--else--if
		
		if(a==b) {
			System.out.println("F");
		}
		else if(a<=b) {
			System.out.println("F");
		}
		else if(a<b) {
			System.out.println("F");
		}
		else {
			System.out.println("All statements are false");
		}
		
		//nested--if
		
		if(a<b) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		

	}

}
