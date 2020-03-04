package interfaceexamples;


interface A{
	void test1();
	void test2();
}

class B implements A{

	@Override
	public void test1() {
		System.out.println("test1() overridden in B");
		
	}

	@Override
	public void test2() {
		System.out.println("test2() overridden in B");
		
	}
	
}

public class Tester {

	public static void main(String[] args) {
		B rv= new B();
		rv.test1();
		rv.test2();

	}

}
