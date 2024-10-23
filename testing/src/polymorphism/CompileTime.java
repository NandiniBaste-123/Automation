package polymorphism;

public class CompileTime {

	public static void main(String[] args) {
		sum(10,4);
		CompileTime.sum(18, 10, 22);
		CompileTime.substarction(50, 30, 10);
		CompileTime.substraction(80, 50);
	}
	static void sum(int a,int b) {
		int c=a+b;
		System.out.println("sum of a+b="+c);
	}
	static void sum(int a,int b,int d) {
		int c=a+b+d;
		System.out.println("sum of a+b+d="+c);
	}
	static void substraction(int a, int b) {
		int c=a-b;
		System.out.println("substraction of a-b="+c);
	}
	static void substarction(int a, int b, int d) {
		int c= a-b-d;
		System.out.println("substarction of a-b-d="+c);
	}

}
