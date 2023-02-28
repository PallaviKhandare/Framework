
public class Test_2 {
	
	public void m1() {
		System.out.println("Nothing is impossible");
	}
	 public static void m2() {
		 System.out.println("Team static");
	 }
	 
	 public void Add(int a,int b) {
		 System.out.println(a+b);
	 }
	 
	 public void Sub(int a,int b) {
		 System.out.println(a-b);
	 }
	  
	 public void Multiple(int a,int b) {
		 System.out.println(a*b);
	 }

	public static void main(String[] args) {
		
		Test_2 t=new Test_2();
		t.m1();
		t.Add(10,20);
		t.Sub(30,20);
		t.Multiple(5, 40);
	}

}
