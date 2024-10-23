package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		//ArrayList a1=new ArrayList();
	 List l1=new ArrayList();
	 List l2=new ArrayList();
	 
	 l1.add("apple");
	 l1.add("mango");
	 l1.add("banana");
	 l1.add(1234);
	 l1.add("Watermelon");
	 System.out.println("element in list :"+l1);
	 System.out.println(" number of elements in list:"+l1.size());
	 l1.add(5, "melon");
	 System.out.println("element in list :"+l1);
	 System.out.println(" number of elements in list:"+l1.size());
	 System.out.println(" get element on a particular index with get method:"+l1.get(3));
	 l1.set(3, "Gava");
	 System.out.println("element in list :"+l1);
	 l1.remove(3);
	 System.out.println("element in list :"+l1);
	// l1.clear();
	// System.out.println("element in list :"+l1);
	// System.out.println(" number of elements in list:"+l1.size());
	 System.out.println("print element using for loop");
 for(int i=0;i< l1.size();i++) {
	 System.out.println("element on index"+i +":"+l1.get(i));
 }

 System.out.println("print element using for-each loop");
 		for(Object obj:l1) {
 			System.out.println(obj);
 			
 		}
	 
	 
	 
	 l2.add(5);
	 l2.add(10);
	 l2.add(15);
	 
	 System.out.println("*************************************");
	 System.out.println("element in list :"+l2);
	 System.out.println(" number of elements in list:"+l2.size());
	 l2.addAll(l1);
	 System.out.println(" elements in l2 after addall :"+l2);
	 
	 System.out.println(" number of elements in list:"+l2.size());
	 l2.removeAll(l1);
	 System.out.println(" number of elements in list:"+l2.size());
	 System.out.println(" elements in l2 after removeall :"+l2);
	 
	 
	 
		

	}

}
