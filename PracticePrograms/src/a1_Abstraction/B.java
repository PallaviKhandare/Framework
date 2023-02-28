package a1_Abstraction;
abstract class Bank {
	 abstract void ROI();
 }
 class b1 extends Bank{
	 void ROI(){
		 System.out.println("SBI.RateofInterest=2%");
	 }
 }
 class b2 extends Bank{
	 void ROI(){
		 System.out.println("HDFC.RateOfInterest=4%");	 
	 }
 }
 class b3 extends Bank{
	 void ROI() {
		 System.out.println("AXIS.RateOfInterest=5%");
	 }
 }
 
 
 public class B extends Bank{
	 void ROI(){
		 System.out.println("UNION.RateOfInterest=3%");
	 }
	 
	 public static void main(String[] args) {
		 
		 b1 SBI=new b1();
		 b2 HDFC=new b2();
		 b3 AXIS=new b3();
		 B UNION=new B();
		 
		 SBI.ROI();
	   	HDFC.ROI();
	   	AXIS.ROI();
	   	UNION.ROI();
	

	}

}


