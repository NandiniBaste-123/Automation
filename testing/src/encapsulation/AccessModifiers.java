package encapsulation;

public class AccessModifiers {
	private int num1=10;
	int num2=20;
	protected int num3=30;
	public int num4=40;
	
	public static void main(String[] args) {
		AccessModifiers ref=new AccessModifiers();
		System.out.println("num1="+ref.num1);
		System.out.println("num2="+ref.num2);
		System.out.println("num3="+ref.num3);
		System.out.println("num4="+ref.num4);
	}

}
class Demo2{
	public static void main(String[] args) {
		AccessModifiers ref=new AccessModifiers();
		//System.out.println("num1="+ref.num1);cant use outside the method as private
		System.out.println(" accessmodifers num2="+ref.num2);
		System.out.println("num3="+ref.num3);
		System.out.println("num4="+ref.num4);
	}
	
	
	
}