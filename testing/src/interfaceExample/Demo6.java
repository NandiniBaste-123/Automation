package interfaceExample;
interface A2{
	int num1=20;
	int num2=30;
	int result=num1+num2;
			
	public abstract void shape();
	abstract void color();
}
class Add implements A2{
	public void shape() {
		System.out.println(" I am shape");
	}
	public void color() {
		System.out.println(" I am color ");
	}
}

public class Demo6 {
	
	public static void main(String[] args) {
		Add A1=new Add();
		A1.color();
		A1.shape();
		System.out.println("interface A2 variable num1="+A1.num1);
		System.out.println("interface A2 variable num2="+A1.num2);
		System.out.println("interface A2 variable result="+A1.result);
	}

}
