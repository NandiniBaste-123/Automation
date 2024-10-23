package arrayAssignment;

public class A1 {
	public static void main(String[] args) {
		minNum();
		maxNum();
	}
	static void minNum() {
	// Find minimum number from the range
	int a[]= {20,5,8,56,78,35,25,41,7,2};
	int min=a[0];//considering 1st num as min
	for(int i=1;i<a.length;i++) {
		//System.out.println(a[i]);
		if(min>a[i]) {
			min=a[i];
			System.out.println(a[i]);
		}
	} 
		
	
	}
	
	static void maxNum() {
		int num[]= {20,5,8,4,6,90,67,85,45,63};
		int max=num[0];// considering 1st num as max
		for(int i=1;i<num.length;i++) {
			if(max< num[i]) {
				max=num[i];				
				System.out.println("max number="+num[i]);
			}
		}
		
	}
}
