package constructor;

public class Constructorexample1 {
	Constructorexample1(){
		System.out.println("hi I am zero para-cons");
	}
	
	Constructorexample1(int a){
		age=a;
	}
	 Constructorexample1(int a, double b){
		age=a;
		salary=b;
	 }

	int age;
	double salary;
	public static void main(String[] args) {
		System.out.println("program starts");
		Constructorexample1 ref=new Constructorexample1();
		System.out.println("age="+ref.age);
		System.out.println("salary="+ref.salary);
	
		Constructorexample1 ref1=new Constructorexample1(10);
		System.out.println("age="+ref1.age);
		System.out.println("salary="+ref1.salary);
		 Constructorexample1 ref2=new  Constructorexample1(50,40000.50);
		 System.out.println("age="+ref2.age);
			System.out.println("salary="+ref2.salary);
		System.out.println("program ends");

	}

}
