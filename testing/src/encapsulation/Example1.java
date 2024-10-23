package encapsulation;
 
public  class Example1 {
	private int empId=101;
	private double salary=25000;
	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println("EmpId="+ref.empId);
		System.out.println("salary="+ref.salary);
	}
	public int getempId() {
		return empId;
	}
	public double getsalary() {
			return salary;
		}
	public void setempId(int empId) {
		this.empId=empId;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	}


