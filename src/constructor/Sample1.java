package constructor;

public class Sample1 {
	
	int stdId;
	Sample1(){
		System.out.println("Running Constructor...");
	}

	public static void main(String[] args) {
		Sample1 rv= new Sample1();
		System.out.println("The value of rv.stdId "+rv.stdId);
		
		Sample1 rv1 = new Sample1();
		System.out.println("The value of rv1.stdId "+rv1.stdId);
		

	}

}
