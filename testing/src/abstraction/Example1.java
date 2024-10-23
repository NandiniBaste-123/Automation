package abstraction;
abstract class Demo1{
	void print() {
		System.out.println("Program Starts Hi i am print method from abstract class demo1");
	}
	abstract void details();
	
}
public class Example1 extends Demo1 {
	
	void details() {
		System.out.println(" hi i am details overrided method from example1");
	}
	public static void main(String[] args) {
		Example1 e1=new Example1();
		//e1.print();
		//e1.details();  OR
		Demo1 d1=new Example1();
		d1.print();
		d1.details();
	}

}
