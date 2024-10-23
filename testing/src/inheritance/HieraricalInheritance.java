package inheritance;
class Vehicle1{
	void myVehicle() {
		System.out.println(" from vehicle method ");
	}
}
class Car1 extends Vehicle1{
	void myCar() {
		System.out.println(" i am car");
	}
}
class Bike extends Vehicle1{
	void bike() {
		System.out.println(" i am bike");
	}
}
class Truck extends Vehicle1{
	void myTruck() {
		System.out.println(" i am Truck");
	}
}
public class HieraricalInheritance {

	public static void main(String[] args) {
		Truck t1=new Truck();
		t1.myVehicle();
		t1.myTruck();
		Bike b1=new Bike();
		b1.bike();
		b1.myVehicle();
		Car1 ref=new Car1();
		ref.myCar();
		ref.myVehicle();
		

	}

}
