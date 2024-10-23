package objectclass;
class Demo1{
	void calling() {
		System.out.println(" hi i am calling from demo1");
	}
}
public class Example1 extends Demo1 {

	public static void main(String[] args) {
		Example1 ref=new Example1();
		ref.disaplay();
		ref.calling();
		System.out.println(" example1 ref="+ref.toString());//  explicit it give fully qualified name and hexadecimal address
		Example1 ref2=new Example1();
		System.out.println(" example1 ref2="+ref2);//implicit
		System.out.println("get integer value of ref object adress  with the help of hashcode method"+ref.hashCode());
		System.out.println("get integer value of ref object adress  with the help of hashcode method"+ref2.hashCode());
	// only call with explicit way 
		// for comparing we use equals method and it return bollean value like true or false
		System.out.println("comparing ref with ref2="+ref.equals(ref2));
		Example1 ref3=ref2;
		System.out.println("integer value of ref3="+ref3.hashCode());
		System.out.println("comparing ref with ref2="+ref2.equals(ref3));
		Demo1 d1=new Example1();
		System.out.println("integer value of d1="+d1.hashCode());
		
		
		
	}
	
	void disaplay() {
		System.out.println("hi I am display from example1");
	}
	
}
