package abstractclassprog;

abstract class College{
	abstract void display();
}

class Student extends College{
    
	String name = "Rama";
	String dept = "Mechanical";
	int stdId = 4545;
	
	@Override
	void display() {
		
	   System.out.println("Name "+name);
	   System.out.println("Department "+dept);
	   System.out.println("Student id "+stdId);
	 	
	}
	
}

class Faculty extends College{

	String name = "Seeth";
	String subject ="Java";
	int empId = 4588;
	
	
	@Override
	void display() {
		System.out.println("Name "+name);
		System.out.println("Subject "+subject);
		System.out.println("Emp id "+empId);	
		
	}
	
}

public class Tester2 {

	public static void main(String[] args) {
		Student rv = new Student();
		rv.display();
		
		Faculty rv1 = new Faculty();
		rv1.display();

	}

}
