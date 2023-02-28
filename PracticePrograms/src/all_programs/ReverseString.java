package all_programs;

public class ReverseString {

	public static void main(String[] args) {
		String name1="pallavi";
		String name2="";
		int len=name1.length();
		for(int i=len-1;i>=0;i--) {
			name2=name2+name1.charAt(i);
		}
		System.out.println("Rev String=" + name2);
		

	}

}
