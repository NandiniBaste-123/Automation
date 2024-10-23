package polymorphism;
class Animal{
	void eat() {
		System.out.println("I am eat from Aniaml");
	}
}
class Herbivorse extends Animal {
	void eat() {
		System.out.println("I am eat from herbivorse");
		
	}
}
class Carnivorse extends Animal{
	void eat() {
		System.out.println("I am eat from Caenivorse");
		
	}
}
class Omnivorse {
	void walking() {
		System.out.println("I am walking from Omnivorse");
		
	}
}
public class Runtime {

	public static void main(String[] args) {
		Animal a1=new Herbivorse(); // inherutance upcasting overriding all 3 conditions fullfil
		a1.eat(); 
		Animal a2=new Carnivorse();
		a2.eat();
	}

}
