package a1_Inheritance;

public class a1 {
	
	public void m1() {
		System.out.println("m1");
	}
}
  


  public class a2 extends a1{
	
	public void m3() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
		
		a2 a=new a2();
		a.m1();
		a.m3();
		
		a1 b=new a1();
		b.m1();
		b.m3();
	

	}

}
