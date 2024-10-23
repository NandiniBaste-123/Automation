package vector1;

import java.util.Vector;

public class Example1 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement("apple");
		v1.addElement("rose");
		v1.addElement("mumbai");
		v1.addElement("mango");
		v1.addElement("rose");
		System.out.println(v1);
		System.out.println(" first element in v1="+v1.firstElement());
		System.out.println(" last element in v1="+v1.lastElement());
		System.out.println("last index of rose="+v1.lastIndexOf("rose"));
		System.out.println("capacity of vector="+v1.capacity());
		

		

	}

}
