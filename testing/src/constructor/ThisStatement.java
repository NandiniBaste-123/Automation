package constructor;

public class ThisStatement {
	int num;
	ThisStatement(){
		this(10);
		System.out.println("hi I am zero para- cons");
		num=25;
	}
	ThisStatement(int a){
		this(11.3);
		System.out.println("hi i am int para-cons");
		num=a;
	}
	ThisStatement(double a){
		System.out.println("hi i am double para cons");
	}
	public static void main(String[] args) {
		
		System.out.println("program starts");
		ThisStatement ref=new ThisStatement();
		System.out.println("program ends");
	}

}
