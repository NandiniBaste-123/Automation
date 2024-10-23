package primitiveCasting;
class Parent{
	void Car() {
		System.out.println(" I am Car from parent class");
	}
}
class Child extends Parent{
	void Bike() {
		System.out.println(" I am BIke from child class");
	}
}
public class NonPrimitive {

	public static void main(String[] args) {
		Child ref=new Child();
		//Parent p1=new Child(); implicit up casting 
		Parent p1=ref; //impicit up casting
		Parent p2=(Parent)ref;// explicit up casting
		Parent p3=(Parent)new Child();// explicit up casting 
		System.out.println("**********up casting*******************");
		p3.Car();
		ref.Bike();
		System.out.println("*************Down Casting ******************************");
		//Child c1=new Parent(); not possible only upcast object can be downcast
		Child ref2=(Child)p1;
		p1.Car();
	
		
	}

}
