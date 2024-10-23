package Arrays;

public class Example1 {

	public static void main(String[] args) {
		int[] num =new int[5];
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		num[0]=10;//initialisation
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;	
		System.out.println("***************************************");
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println("array element count="+num.length);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		//for each loop
		System.out.println("WITH for each loop ");
		for(int a :num) {
			System.out.println(a);
			}
		char[] letters= { 'a','b','c','d'};
		//System.out.println(letters);
		for(char A:letters) {
			System.out.println(A);}
			char[] getArray=new char[] { 'A','B','C','D'};
			for(char num1:getArray) {
				System.out.println(num1); 
				
			}		
			
		

}

}