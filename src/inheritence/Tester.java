package inheritence;

class A{
	
	void test(){
		System.out.println("From test() of class A");
	}
	
}

class B extends A{
	
	void test1(){
		System.out.println("From test1() of class B");
	}
	
}

class Tester {

	public static void main(String[] args) {
		B rv = new B();
		rv.test();
		rv.test1();

	}

}


