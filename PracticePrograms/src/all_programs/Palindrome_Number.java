package all_programs;

public class Palindrome_Number {

	public static void main(String[] args) {
		String a="454";
		String rev="";
		int length=a.length();
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		if(a.equalsIgnoreCase(rev)) {
			System.out.println("The Number is Palindrome");
		}else {
			System.out.println("The Number is not palindrome");
		}

	}

}
