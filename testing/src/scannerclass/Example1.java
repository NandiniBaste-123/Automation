package scannerclass;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
		int num1,num2,res;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter num1:  ");
		num1=scn.nextInt();
		System.out.println("enter num2:  ");
		num2=scn.nextInt();
		res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("result="+res);
	}

}
