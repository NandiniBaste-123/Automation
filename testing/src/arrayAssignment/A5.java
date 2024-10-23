package arrayAssignment;

public class A5 {
	public static void main(String[] args) {
		int a[]= {10,2,3,4,5,6};
		int small=a[0];
		for(int i=1;i<a.length;i++) {
			if(small>a[i]) {
				small=a[i];
				System.out.println(a[i]);
			}
			}
		/*System.out.println("******largest number ******************");
		int b[]= { 20,50,60,30,80};
		int large=b[0];
		for(int l=1;l<b.length;l++ ) {
			if(large<b[l]) {
				large=b[l];
							}System.out.println(b[large]);
		}System.out.println(b[large]);*/

		int num[]= {3,4,7,8,2};	
		int large=num[0];
		for(int i=1;i<num.length;i++) {
			if(large<num[i]) {
				large=num[i];
			}
			}System.out.println(large);
			
		}
}
