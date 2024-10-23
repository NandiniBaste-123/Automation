package inheritance;
class Vehicle{
	void vehicle() {
		System.out.println(" hi i am vehicle method");
	}
}
class Car extends Vehicle{
	void car(){
		System.out.println("hi i am car method");
	}
}
class Alto extends Car{
	void alto() {
		System.out.println(" ho i am alto method");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Alto A1=new Alto();
       A1.vehicle();
       A1.car();
       A1.alto();
	}

}
