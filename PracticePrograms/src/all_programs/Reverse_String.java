package all_programs;

public class Reverse_String {

	public static void main(String[] args) {
		String a="Pallavi";
		String rev="";
		int length=a.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("The reverse String="+rev);
		

	}

}
