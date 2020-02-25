package overriding;

class Person{
	String fname = "Vijay";
	String lname = "Mallaya";
	void display(){
		System.out.println("The First Name is = " +fname);
		System.out.println("The Last Name is = " + lname);
	}
	
}

class Trainer extends Person{
	String subject = "Java";
	double salary = 9999.99;
	
    void display(){
		super.display();
		System.out.println("Subject "+subject);
		System.out.println("Salary "+salary);
	}
}


public class Tester1 {

	public static void main(String[] args) {
		Trainer rv = new Trainer();
		rv.display();

	}

}
