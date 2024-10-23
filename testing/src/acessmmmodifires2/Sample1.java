package acessmmmodifires2;

import encapsulation.AccessModifiers;

public class Sample1 extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1  ref=new Sample1();
		//System.out.println("num1="+ref.num1);private 
		//System.out.println("num2="+ref.num2);default can't run outside the package
		//System.out.println("num3="+ref.num3);//protected need child class to run inheritance is mandatory
		//System.out.println("num4="+ref.num4);

	}

}
class Sample2{
	public static void main(String[] args) {
		AccessModifiers  ref= new AccessModifiers();
		//System.out.println("num1="+ref.num1);private 
		//System.out.println("num2="+ref.num2);default can't run outside the package
	 //System.out.println("num3="+ref.num3);//protected need child class to run inheritance is mandatory
		System.out.println("num4="+ref.num4);

	}
}
