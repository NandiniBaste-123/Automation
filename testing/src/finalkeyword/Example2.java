package finalkeyword;

public class Example2 {
	final static int num1;
	final int num2;
	final int age;
	public static void main(String[] args) {
		System.out.println("num1="+num1);
		Example2 ref=new Example2();
		System.out.println("num2="+ref.num2);
		System.out.println("age="+ref.age);
	}
	static {
		num1=39;
	}
	{
		//non static block
		num2=80;
	}
	Example2(){
		age=90;
	}
	}

