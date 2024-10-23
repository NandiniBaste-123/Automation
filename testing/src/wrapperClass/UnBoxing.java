package wrapperClass;

public class UnBoxing {

	public static void main(String[] args) {
		int num1=50;
		Integer ref1=num1;//boxing
		Integer n1=ref1.intValue();
		System.out.println("ref1="+ref1);
		System.out.println("n1="+n1);
		
		
		boolean status = false;
		Boolean ref2=false;
	    boolean b1=ref2.booleanValue();
	    System.out.println("b1="+b1);
		System.out.println(" practice boxing and unboxing operation ");

	}

}
