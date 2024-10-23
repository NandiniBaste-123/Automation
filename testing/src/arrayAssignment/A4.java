package arrayAssignment;

public class A4 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
	
			if( a[i]%2==0) {
				System.out.println("even numbers="+a[i]);
			}
		}
		System.out.println("odd number");
		for(int i=0;i<a.length;i++) {
			
			if( a[i]%2!=0) {
				System.out.println("odd numbers="+a[i]);
			}
		}
		System.out.println(" by using for each loop");
		for(int num:a) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
		
	}

}
