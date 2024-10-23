package arrayAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A2 {

	public static void main(String[] args) {
		// copy elements from one array to another
		char letters[]= {'a','b','c','d','e','f','g'};
		System.out.println("length of array "+letters.length);
		char letters2[]= Arrays.copyOf(letters, 7);
		System.out.println("length of array "+letters2.length);
		for(int i=0;i<letters.length;i++) {
			System.out.print(letters[i]+ " ");
		}
		System.out.println("\n copy using range");
		char copyRange[]=Arrays.copyOfRange(letters2, 2, 7);
		for(char a:copyRange) {
			System.out.print(" "+a);
		}
		
		System.out.println("\n********sorting of elements***********************");
		Arrays.sort(copyRange);
		for(char b:copyRange) {
			System.out.print(b+" ");
			
		}
		System.out.println("\n*********copy with clone*****************");
		// clone helps to copy the data as it is while using  copyOf arrays method we can copy the data as per 
		int num1[]= {5,8,7,6,9,3,8,0,1,3,2,10,4,11,15,80};
		int clonenArray[] = num1.clone();
	for(int k :num1) {
		System.out.print(k+" ");
	}
	int num2[]=Arrays.copyOf(clonenArray, 7);
	for(int d:num2) {
		System.out.print(d+" ");
		
	}
	System.out.println("\n*********copy with range*********************************************");
	int num3[]=Arrays.copyOfRange(num2, 3, 9);
	for(int f:num3) {
		System.out.print(f+" ");
	}
	Arrays.sort(num3);
	for(int g:num3) {
		System.out.print(g+" ");
	}
	System.out.println("\n*********copy with clone*****************");
	int cloneArray[]=num3.clone();
	for(int h:num3) {
		System.out.print(h+",");
	}
	System.out.println("\n***************sorting***********");
	Arrays.sort(num1);
	for(int l:num1) {
		System.out.print(l+" ");
	}
	
	
	
	
	
	
			
	}

}
