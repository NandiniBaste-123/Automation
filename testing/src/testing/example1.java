package testing;

public class example1 {

	public static void main(String[] args) {
		System.out.println("program starts");
		//method overloading
		printDetails();
		printDetails(10);
		printDetails(10,30);
		printDetails(10,20.5);
		printDetails(40.5,10);
		
		System.out.println("program ends");
	}
	static void printDetails() {
		System.out.println("hello ");
		System.out.println("its method overloading program");
	}
	static void printDetails(int num1) {
		System.out.println("number1="+num1);
	}
	static void printDetails(int num1 ,int num2) { // difference in argument
		int res1=num1+num2;
		System.out.println("number1="+num1);
		System.out.println("number2="+num2);
		System.out.println("result1="+res1);
	}
	static void printDetails(int num1 ,double num2) {// difference i  number of argument
		double res2=num1+num2;
		System.out.println("number1="+num1);
		System.out.println("number2="+num2);
		System.out.println("result2="+res2);
	}
	static void printDetails(double num1 ,int num2) {// difference in position of argument
		double res3=num1+num2;
		System.out.println("number1="+num1);
		System.out.println("number2="+num2);
		System.out.println("result2="+res3);
	}
}
