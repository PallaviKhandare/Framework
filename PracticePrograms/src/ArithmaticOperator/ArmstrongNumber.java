package ArithmaticOperator;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=371, ONumber, R,O=0;
		ONumber=n;
		
		while(ONumber!=0)
		{
			R=ONumber%10;
			O+=Math.pow(R, 3);
			ONumber/=10;
		}
		if(O==n)
			System.out.println("is an Armstrong No.");
		else
			System.out.println("not an Armstrong No.");
		

	}

}
