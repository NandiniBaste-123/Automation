package inheritance;
class Animal{
	int num=23;
	void dog() {
		System.out.println("I am dog i can walk , run and bark");
	}
	void cat() {
		System.out.println("i am cat i can walk and run");
	}
}
class Tiger extends Animal{
	int num=28;
	@Override
	protected void dog() {
		System.out.println("I am dog from Tiger class overidden method");
		//super.dog();
		System.out.println("num from animal="+super.num);
		System.out.println(" num from tiger="+num);
	}
	void lion() {
		System.out.println(" I am lion");
		super.dog();
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		System.out.println("program starts");
		Tiger t1=new Tiger();
		t1.cat();
		t1.dog();
		t1.lion();
		System.out.println("***************************************");
		Animal A1=new Tiger();
		A1.dog();
		
		System.out.println("program ends");
	}

}
