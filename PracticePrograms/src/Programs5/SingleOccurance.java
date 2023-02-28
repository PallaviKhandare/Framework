package Programs5;

public class SingleOccurance {

	public static void main(String[] args) {
		String s = "abcdefabcdef";
		int count = 0;
		
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)=='a')
			{
				count = count +1;
			}
		}
		System.out.println("The char a is available for "+count+" times");

	}

}
