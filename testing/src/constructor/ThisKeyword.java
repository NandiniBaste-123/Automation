package constructor;

public class ThisKeyword {
	static int age;
	int num;
	int empId;
	public static void main(String[] args) {
		System.out.println("sgv="+age);
		int age=25;
		System.out.println("lgv="+age);
		ThisKeyword.age=age;
		System.out.println("sgv="+ThisKeyword.age); //static global variable
		int num=4;
		System.out.println("local variable="+num);
		ThisKeyword ref =new ThisKeyword();
		System.out.println("non static global variable="+ref.num);
		ref.num=num;
		ref.calling();
		System.out.println("non static global variable="+ref.num);//non static global variable
	}
void calling() {
	System.out.println("I am from calling");
	System.out.println("empId="+empId);
	empId=213;
	System.out.println("empId="+empId);
	this.empId=empId;
	System.out.println("empId From Calling="+this.empId);
}
}
