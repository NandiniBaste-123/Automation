package arrayAssignment;

public class A3 {

	public static void main(String[] args) {
		//print sum of array 
		int number[]= {5,8,10,7,10,55,50};
		 int sum=0;
		 for(int i=0;i<number.length;i++) {
			  sum=sum+number[i];
		 }
		 System.out.print(sum+" ");
		 //duplicte variable
		 int a[]= {1,2,3,2,4,5,6};
		 for(int b=0;b<a.length;b++) {
			 
			 for(int j=b+1;j<a.length;j++) {
				 if(a[b]==a[j]) {
					 System.out.println("found duplicate variable="+a[b]);
				 }
				 
			 }
		 }

	}
	

}
