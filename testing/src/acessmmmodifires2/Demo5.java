package acessmmmodifires2;



public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation.AccessModifiers  ref= new encapsulation.AccessModifiers();
		//System.out.println("num1="+ref.num1);private 
		//System.out.println("num2="+ref.num2);default can't run outside the package
	 //System.out.println("num3="+ref.num3);//protected need child class to run inheritance is mandatory
		//System.out.println("num4="+ref.num4);

	}

}
class Demo6{
	public static void main(String[] args) {
		encapsulation.AccessModifiers  ref= new encapsulation.AccessModifiers();
		System.out.println("num4="+ref.num4);


	}
	
}