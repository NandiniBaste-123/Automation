package abstraction;
abstract class Sample1{
	void example1() {
		System.out.println(" program starts with example1 method from sample1");
	}
	abstract void example2();
	abstract void example3();
}
public class Example2 extends Sample1 {
	void example2() {
		System.out.println("hi i am example2 method from child class");
	}
	void example3() {
		System.out.println("hi i am example3 method from child class");
		
	}
	public static void main(String[] args) {
		Example2 e2=new Example2();
		e2.example1();
		e2.example2();
		e2.example3();
	}

}
