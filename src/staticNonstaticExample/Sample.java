package staticNonstaticExample;

public class Sample {
	
	/*Non Static members can have
	multiple copies and all are independent*/
	
	int empId=0;

	public static void main(String[] args) {
		System.out.println("The Main Starts.....");
		Sample rv = new Sample();
		rv.empId=90;
		System.out.println("rv.empId = "+rv.empId);
		
		Sample rv1 = new Sample();
		System.out.println("rv1.empId = "+rv1.empId);
		System.out.println("The Main Ends.....");
	}

}
