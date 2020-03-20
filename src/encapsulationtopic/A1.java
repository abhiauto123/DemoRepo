package encapsulationtopic;

public class A1 {
	
	static A1 a;
	int stdId;
	
	static void test(){
		System.out.println("The Value of stdId"+a.stdId);
	}

	public static void main(String[] args) {
		a = new A1();
		System.out.println(a.stdId);
		test();

	}

}


