package stringclass;

public class Example1 {

	public static void main(String[] args) {
		String s1="Pune"; 
		String s2="Pune";
		String s3="Mumbai";
		
		System.out.println("s1="+s1+"=char count="+s1.length());
		System.out.println("s2="+s2+"=char count="+s2.length());
		System.out.println("s3="+s3+"  char count="+s3.length());
		
		System.out.println("*******************Comparing *****************************************");
		System.out.println("compare based on value="+s1.equals(s2));
		System.out.println("compare based on address="+(s1==s2));
		System.out.println("compare s1 with s3 based on value="+s1.equals(s3));
		System.out.println("compare s1 with s3 based on address="+(s1==s3));
		
		
		String s4=new String ("Banglore");// 2 object will be created one in constant pool and one in non constant pool
		String s5=new String ("Pune");// only one object will created in non constant pool 
		System.out.println("charter on 3rd index="+s4.charAt(3));
		System.out.println("s4="+s4+"  char count="+s4.length());
		System.out.println("s1="+s5+"  char count="+s5.length());
		System.out.println("compare s1 with s5 based on vale="+s1.equals(s5));
		System.out.println("compare s1 with s5based on address="+(s1==s3));


		
		

	}

}
