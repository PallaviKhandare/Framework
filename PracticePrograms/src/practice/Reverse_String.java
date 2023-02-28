package practice;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Pallu";
		String name1=" ";
		int len=name.length();
		for(int i=len-1;i>=0;i--) {
			name1=name1+name.charAt(i);
			
		}
		System.out.println("Reverse String=" + name1);
		
		

	}

}
