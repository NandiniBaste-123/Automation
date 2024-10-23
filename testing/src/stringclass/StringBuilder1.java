package stringclass;

public class StringBuilder1 {

	public static void main(String[] args) {
	StringBuilder b1=new StringBuilder("Hello");
	b1.append("  i am from mumbai");
	System.out.println(b1);
	System.out.println(b1.indexOf("m"));
	b1.insert(5, "OOOOOO");
	System.out.println(b1);
	b1.delete(5, 8);
	System.out.println(b1);
	b1.replace(5, 8, "pune");
	System.out.println(b1);
	b1.reverse();
	System.out.println(b1);
	

	}

}
