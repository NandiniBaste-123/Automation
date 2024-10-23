package exeptionHandling;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("program starts");
		try {
		int res=10/0;
		System.out.println("res="+res);
		}catch(ArithmeticException e){
			e.printStackTrace();// for complete exception as it is
	
		}
		catch ( Throwable e) {
			System.out.println("execption msg="+e.getMessage());
			System.out.println("exception class and msg="+e);
			e.printStackTrace();// for complete exception as it is
		}
		System.out.println("program ends");

	}

}
