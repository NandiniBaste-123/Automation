package abstraction;
abstract class Animal{
	abstract public void sound();
	void height() {
		System.out.println("program starts");//hierarichal inheritance using abstarction
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println(" dog sound like bho bhoo");
		
	}
	void color() {
		System.out.println(" I am a black color dog");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("CAt sounds like meow meow");
	}
}

public class MultiLevelInheritanceAbstarction {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.color();d1.height();d1.sound();
		Cat c1=new Cat();
		c1.sound();
	}

}
