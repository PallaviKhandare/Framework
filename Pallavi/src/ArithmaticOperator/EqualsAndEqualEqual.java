package ArithmaticOperator;

public class EqualsAndEqualEqual {

	public static void main(String[] args) {
		
		//String s1= "PALLAVI";
		//String s2= "PALLAVI";
		//String s3=new String("PALLAVI");
		
		//System.out.println(s1==s2);//true
		//System.out.println(s1==s3);//false
		//System.out.println(s1.equals(s2));//true
		//System.out.println(s1.equals(s3));//true
		
		Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
 
        String s1 = new String("GEEKS");
        String s2 = new String("GEEKS");
 
        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(s1 == s2);
 
        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2));
   

	}

}
