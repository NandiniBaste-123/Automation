package finalkeyword;

public class example1 {
	final static int age=20;
	final  int salary=35000;
	public static void main(String[] args) {
		final int num;
		num=20;
		System.out.println("num="+num);
		example1 ref=new example1();
		System.out.println("non static salry="+ref.salary);
		System.out.println("static age="+age);
	}

}
