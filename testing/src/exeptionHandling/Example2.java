package exeptionHandling;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int[] res=new int[3]; 
		try {
			res[3] = 10/0;// abnormal statement
			System.out.println("res="+res);
		}/**catch(ArithmeticException e) {
		System.out.println(" 1st catch box");
		
		
			e.printStackTrace();
		}*/catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" 2nd  catch box");
			
			e.printStackTrace();
		}catch (Throwable e) {
			System.out.println(" 3st catch box");
			
			e.printStackTrace();
		}
		System.out.println("**************************************************************");
		try {
			res[3] = 10/5;// abnormal statement
			System.out.println("res="+res);
		}catch(ArithmeticException e) {
		System.out.println(" 1st catch box");
		
		
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" 2nd  catch box");
			
			e.printStackTrace();
		}catch (Throwable e) {
			System.out.println(" 3st catch box");
			
			e.printStackTrace();
		}
		System.out.println("Program Ends");

	}

}
