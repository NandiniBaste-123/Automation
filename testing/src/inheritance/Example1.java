package inheritance;
class GrandFather{
	GrandFather(){
		System.out.println("hello I am Grandfather");
		int num1=45;
	}
	void myHome() {
		System.out.println("i have home from grandfathers class");
		
	}
}
class Father extends GrandFather{
	Father(){
		System.out.println("hi I am Father");
		int num2=35;
		System.out.println(num2);
	}
	void myCar() {
		System.out.println("I have car from fathers class");
	}
}
class Child extends Father{
	Child(){
		System.out.println("hi I am child class");
		int num3=25;
	}
	void myBike() {
		System.out.println(" i have bike from child class");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Child c1=new Child();
	c1.myHome();
	c1.myCar();
	c1.myBike();

	}

}
