package a1_Encapsulation;

public class Student {

	private int RollNo;
	
	private String name;
	
	public void setRollNo(int RollNo,String name) {
		
		this.RollNo=RollNo;
		this.name=name;
	}
	
	public int getRollNo() {
		return RollNo;
	}
	
	public String getname() {
		return name;
	}
	public static void main(String[]args) {
		
		Student a=new Student();
		a.setRollNo(10, "JERRY");
		System.out.println(a.getRollNo()+" "+a.getname());
		a.getRollNo();
	}
		

	

}
