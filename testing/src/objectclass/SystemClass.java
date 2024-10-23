package objectclass;
class Selinium{
	void calling() {
		System.out.println(" I am calling from selinium class");
	}
}
public class SystemClass {
	static Selinium ref2=new Selinium();
	public static void main(String[] args) {
		System.out.println("try to practice system class");
		Selinium ref=new Selinium();
		ref.calling();
		SystemClass ref1=new SystemClass();
		//ref1.display();
		SystemClass.ref2.calling();
		SystemClass.display();
		System.err.println("error");
		
		System.out.println("user current  directory"+System.getProperty("user.dir"));
		System.out.println("Home directory"+System.getProperty("user.home"));
		System.out.println("system time"+System.currentTimeMillis());
		
		
		
	}
	 static void display() {
		System.out.println("i am disply from SystemClass");
	}

}
