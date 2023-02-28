package a5_StringMethods;

public class a9 {

	public static void main(String[] args) {
		
		//split
		
		String a="hey@How@Are@You";
		
		String[] b=a.split("@");
		
		String b1=b[0];//hey
		String b2=b[1]; //how
		String b3=b[2]; //are
		String b4=b[3]; //you
		
		System.out.println(b2);
		
		System.out.println(b4);

	}

}
