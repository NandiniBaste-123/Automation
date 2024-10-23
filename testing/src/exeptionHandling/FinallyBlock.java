package exeptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("program starts");
		int res;
		try {
			res=10/5;
			System.out.println("res="+res);
			//System.exit(0);//forecefully termination 
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("i am finally block started");
			res=10/0;
			System.out.println("finally block ended");
		}
		System.out.println("program ends");

	}

}
