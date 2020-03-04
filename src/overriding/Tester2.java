package overriding;

class Person1{
	
	String fname;
	String lname;
	
	public Person1(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;		
	}
	
	void display(){
		System.out.println("The First Name of the Person is "+fname);
		System.out.println("The last name of the person is "+lname);
	}
}

class Trainer1 extends Person1{
	
	String subject;
	double salary;

	public Trainer1(String fname, String lname, String subject, double salary) {
		
		super(fname, lname);
		this.subject = subject;
		this.salary = salary;
	}
	
    void display(){
    	super.display();
    	System.out.println("The subject is "+subject);
		System.out.println("The salary is "+salary);
    }
	
}

public class Tester2 {

	public static void main(String[] args) {
		Trainer1 t = new Trainer1("Abhi", "Kumar", "Python", 2222.22);
		t.display();

	}

}
