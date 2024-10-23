package scannerclass;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		//calculate simple interest
		int p,n;
		double i,r;
		Scanner scn =new Scanner(System.in);
		System.out.println("enter principal value");
		p=scn.nextInt();
		
		System.out.println("enter no. of yeras");
		n=scn.nextInt();
		System.out.println("enter rate of int. r= ");
		r=scn.nextDouble();
		i=(p*r*n)/100;
		double Amount=p+i;
		System.out.println("principal value="+p);
		System.out.println("no.of yeras="+n);
		System.out.println("rate of int.="+r);
		System.out.println("interest="+i);
		System.out.println("Amount="+Amount);
		scn.close();

	}

}
