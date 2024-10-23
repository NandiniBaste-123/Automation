package systemclass;
class Sample1{
	void calling() {
		System.out.println(" hi i am calling from sample1");
	}
}
public class Example1 {
	static Sample1 ref1=new Sample1();

	public static void main(String[] args) {
		Sample1 ref=new Sample1();
		ref.calling();
		Example1.disply();
		Example1.ref1.calling();
		System.out.println("find user dir="+System.getProperty("user.dir"));
		System.out.println("find user home="+System.getProperty("user.home"));
		System.out.println("find system name="+System.getProperty("os.name"));
		System.out.println("find system version ="+System.getProperty("os.version"));
		System.out.println("find java home location ="+System.getProperty("java.home"));
		
		System.err.println("error");


		
	}
	static void disply() {
		System.out.println(" hi i am disply from example1");
	}

}
