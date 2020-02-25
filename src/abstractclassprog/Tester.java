package abstractclassprog;

abstract class A{
	abstract void test1();
	abstract void test2();
}

class B extends A{

	@Override
	void test1() {
		System.out.println("Implementation of test1() in B");
		
	}

	@Override
	void test2() {
		System.out.println("Implementation of test2() in B");
		
	}
	
}

public class Tester {

	public static void main(String[] args) {
		B rv = new B();
		rv.test1();
		rv.test2();

	}

}
