package blocks;

public class Example1 {
	 Example1(){
		 System.out.println("I am zera para cons");
	 }
	 int age;
	 static int num;
	public static void main(String[] args) {
		System.out.println("program starts");
		 Example1 ref=new  Example1();
		System.out.println("program ends");
	}
 static {
	 System.out.println("i am static blook 1");
	 num=20;
	 System.out.println("num="+num);
	 
 }
 static {
	 System.out.println("i am static blook 2");
	 disply();
 }
 {
	 System.out.println("i am  non static blook 1");
	 age=20;
	 System.out.println("age="+age);
 }
 
 {
	 System.out.println("i am  non static blook 2");
	 calling();
 }
 void calling () {
	 System.out.println("I am calling method");
	 age=50;
	 System.out.println("age from calling="+age);
 }
 static void disply() {
	 System.out.println("i am disly method");
 }
 
}
