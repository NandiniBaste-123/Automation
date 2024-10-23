package exeptionHandling;
class NandiniException extends Exception{
	NandiniException(String exp){
		super(exp);
	}
}
public class ThrowAndThrows {

	public static void main(String[] args) {
		System.out.println("Program starts");
		//validAge(15);
		try {
			validAge(19);
		} catch (NandiniException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program ends");
	}
	static void validAge(int age) throws NandiniException {
		if(age>18) {
			System.out.println("welcome you can proceed further");
		}else {
			throw new NandiniException("sorry you are bellow 18");
		}
	}

}
