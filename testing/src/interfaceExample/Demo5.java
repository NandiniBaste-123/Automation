package interfaceExample;
interface A1{
	abstract void method1();
	abstract void method2();
}
class Practice implements A1{
	void printDetails() {
		System.out.println(" program starts");
	}
	 public void method1() {
		System.out.println(" I am method 1");
	}
	 public void method2() {
		 System.out.println(" I am method 2"); 
		 System.out.println(" program ends");
	 }
}
public class Demo5 {

	public static void main(String[] args) {
		Practice p1=new Practice();
		p1.printDetails();
		p1.method1();
		p1.method2();
		

	}

}
