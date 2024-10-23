package encapsulation;

public class Example2 {

	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println(ref.getempId());	
		System.out.println(ref.getsalary());
		System.out.println("***************************************");
		ref.setempId(9001);
		ref.setsalary(45000);
		System.out.println(ref.getempId());	
		System.out.println(ref.getsalary());
		}

}
