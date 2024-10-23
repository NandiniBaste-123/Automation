package abstraction;
abstract class Car2{
	abstract void wheel();
	void window() {
		System.out.println(" Hi I am from Car 2");
	}
}
class Alto extends Car2{
	void wheel() {
		System.out.println(" I am wheel from alto");
	}
} 
class Moto extends Alto{
	void method() {
		System.out.println(" i dont need to override car2");
	}
}
public class Car1 {

	public static void main(String[] args) {
		Alto t1=new Alto();
		t1.wheel();
		t1.window();
		Moto m1=new Moto();
		m1.method();
		
	}

}
