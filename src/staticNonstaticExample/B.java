package staticNonstaticExample;

public class B {
	
	static int a=10;
	
	void A(){
		System.out.println("From A "+a);
	}

	public static void main(String[] args) {
		System.out.println("The main starts...");
		B rv = new B();
		rv.A();
		
		System.out.println("From Main "+a);
	}

}
