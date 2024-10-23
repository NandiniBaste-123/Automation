package objectclass;
class Sample1{
	
}
public class Example2 extends Sample1{

	public static void main(String[] args) {
		Example2 e1=new Example2();
		System.out.println("string value of e1="+e1);
		System.out.println("integer valuse of e1="+e1.hashCode());
		
		Example2 e2=new Example2();
	System.out.println("campare e1 with e2="+e1.equals(e2));

	}
	@Override
	public String toString() {
		return "hello";
	}
	@Override
	public int hashCode() {
		return 101;
	}
	@Override
	public boolean equals( Object obj) {
		return false;
	}
	

}
