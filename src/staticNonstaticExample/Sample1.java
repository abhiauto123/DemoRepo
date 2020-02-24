package staticNonstaticExample;

public class Sample1 {
	
	/*static members can have
	multiple copies*/
	
	static int empId=0;

	public static void main(String[] args) {
	   System.out.println("The Main starts...");
	   System.out.println("Sample1.empId ="+Sample1.empId);
	   Sample1.empId=90;
	   System.out.println("Sample1.empId ="+Sample1.empId);
	   Sample1.empId=190;
	   System.out.println("Sample1.empId ="+Sample1.empId);
	   System.out.println("The Main Ends...");
	}

}
