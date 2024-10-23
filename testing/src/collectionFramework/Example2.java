package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("pune");
		l1.add("mumabi");
		l1.add("banglore");
		Iterator itr=l1.iterator();
		//System.out.println(itr.next());
		//itr.next();
		//System.out.println(itr.hasNext());
		//itr.remove();
		//System.out.println(l1);
		while(itr.hasNext()) {
			System.out.println(" print element:"+itr.next());
			
		}

	}

}
