package interfaceExample;
interface Bank{
	 double rateOfInt();
	 
}
class Sbi implements Bank {
	public double rateOfInt() {
		return 8.6;
	}
}
class Pnb implements Bank{
	public double rateOfInt() {
		return 3.5;
	}
}
public class Interface2 {

	public static void main(String[] args) {
		Sbi s1=new Sbi();
         s1.rateOfInt();
         System.out.println("rate of int of sbi="+s1.rateOfInt());
         Pnb p1=new Pnb();
         p1.rateOfInt();
         System.out.println("rate of int of pnb="+p1.rateOfInt());

         }

}
