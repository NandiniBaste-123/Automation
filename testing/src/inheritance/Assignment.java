package inheritance;
class Math1{
	
		int reverseNumber() {
		System.out.println(" i am from math1");
		int num=123456;
		int rem, rev=0;
		for(;num>0;) {
			rev=rev*10+num%10;
			num=num/10;
				}System.out.println(" reverse number="+rev);
				
		return rev;
	}
	void palindromNumber() {
		System.out.println(" i am from math1");
		int num=121; 
		int rev=0,rem,temp;
		temp=num;
		for(;num>0;) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("given number is palindrom="+temp);
		}
		
	}
	void leapYear() {
		System.out.println(" i am from math1");
		int year1=2012;
		if(year1%4==0) {
			System.out.println("given year is leap year="+year1);
		}
	}
}
class Math2 extends Math1{
	void addNumber() {
		System.out.println(" I am from math2");
		int num1=24,num2=26;
		int res=num1+num2;
		System.out.println("number 1="+num1);
		System.out.println("number 2="+num2);
		System.out.println("result="+res);
		super.reverseNumber();
		super.palindromNumber();
		super.leapYear();
	}
	int reverseNumber() {
		System.out.println(" I am from math 2");
		int num=789;
		int rem, rev=0;
		for(;num>0;) {
			rev=rev*10+num%10;
			num=num/10;
			
		}System.out.println(" reverse number="+rev);
		return rev;
		
	} 
		

	
	void palindromNumber() {
		System.out.println("i am from math2");
		int num=141; 
		int rev=0,rem,temp;
		temp=num;
		for(;num>0;) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("given number is palindrom="+temp);
		}
		
	}
	void leapYear() {
		System.out.println(" i am from math1");
		int year1=2024;
		if(year1%4==0) {
			System.out.println("given year is leap year="+year1);
		}
	}
}


public class Assignment {
	public static void main(String[] args) {
		System.out.println("program starts ");
		Math2 m2=new Math2();
		m2.reverseNumber();
		m2.palindromNumber();
		m2.leapYear();
		m2.addNumber();
		System.out.println("program ends");
   
	}

}
