package encapsulation2;

import encapsulation.Example1;

public class Sample1 {

	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println(ref.getempId());
		System.out.println(ref.getsalary());
		System.out.println("*******************************");
		ref.setempId(501);
		ref.setsalary(50000);
		System.out.println(ref.getempId());
		System.out.println(ref.getsalary());

	}

}
