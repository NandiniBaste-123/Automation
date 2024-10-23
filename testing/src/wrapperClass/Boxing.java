package wrapperClass;

public class Boxing {

	public static void main(String[] args) {
		//boxing operation
		int num1=10;
		Integer obj1=num1;
		System.out.println("obj1="+obj1);
		System.out.println("num1="+num1);
		
		char letters='a';System.out.println();
		Character obj2='a';
		System.out.println(" letters="+letters);
		System.out.println("onj2="+obj2);
		char c1=obj2.charValue();// unboxing
		System.out.println("c1="+c1);
		
		
		boolean status=true;
		Boolean obj3=true;
		System.out.println("ststus="+status);
		System.out.println("obj3="+obj3);
		
		double num2=20.5;
		Double obj4=num2;
		System.out.println("num2="+num2);
		System.out.println("obj4="+obj4);
		

	}

}
