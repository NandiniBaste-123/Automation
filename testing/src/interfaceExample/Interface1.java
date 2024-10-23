package interfaceExample;
interface Drawable{
	void circle();
}
interface Printable{
	void Details();
}
class Activity implements Drawable,Printable{
	public void circle() {
		System.out.println(" I am drawing circle");
	}
	public void Details() {
		System.out.println(" I am print details ");
	}
	void method() {
		System.out.println(" i am from activity");
	}
}
public class Interface1  {

	public static void main(String[] args) {
		Activity a1=new Activity();
		a1.circle();
		a1.Details();
		a1.method();
	}

}
