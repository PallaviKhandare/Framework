package Practice;

public class Extract_Char {
	
	
	public static char getCharFromString(String str , int index)
	       {
		    return str.charAt(index);
	       }
	public static void main(String[] args) {
		String str= "Pallavi";
		int index= 4;
		char ch=getCharFromString(str,index);
		System.out.println("character from "+ str +" at index "+ index +" is "+ ch);
		
		

	}

}
