package inheritance;
class Fruits{
	void types() {
		System.out.println("i have many types of fruits");
	}
}
class Mango extends Fruits {
	Mango(){
		super();
	}
	void test() {
		System.out.println("I am mango , a king of fruits ");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
 Mango m1=new Mango();
 m1.types();
 m1.test();
	}

}
