package Arrays;

public class Sample1 {

	public static void main(String[] args) {
		int[] num= {5,10,15,20,25,3};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println(num[5]);
		/*for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
			if(num[i]==25) {
				System.out.println(num[i]+"is present st index"+i);
				break;
			}*/
			for(int a: num) {
				System.out.println(a);
				if(a==25) {
					System.out.println(a+"*");
					break;
				}
			}
		}
	}


