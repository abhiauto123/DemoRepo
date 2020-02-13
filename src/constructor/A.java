package constructor;

public class A {
	
	A(){
		System.out.println("Running Constructor....");
	}

	public static void main(String[] args) {
		System.out.println("The Main Starts...");
		A rv = new A();
		System.out.println("The Main Ends...");
	}

}
