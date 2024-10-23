package primitiveCasting;

public class Example1 {

	public static void main(String[] args) {
		int num=10;
		double num1=num;//implicit widening which is written by java compiler
		System.out.println(" ******widening ****************");
		System.out.println("num="+num);
		System.out.println("num1="+num1);
		int num2=50;
		double num3=(int)num2;// explicit widening which is written by programmer
		System.out.println("num2="+num2);
		System.out.println("num3="+num3);
		System.out.println("*************Narrowing*****************");
		double A1=20.43;
		float  A2=(float)A1;//ony exlicit narrowing is possible implicit not possible
		int A3=(int)A2;
		System.out.println("A1 of double="+A1);
		System.out.println("A2 of float="+A2);//loss of size as we use float its size is 32 bit and size od double is 64 bit

		System.out.println("A3 of int ="+A3);// loss of value double valuse is 20.43 but int store only 20.

		
		
		
	}

}
