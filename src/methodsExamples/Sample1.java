package methodsExamples;

public class Sample1 {
	
	/*Simple prog to show implementation of square*/
	
	static void square(int a){
		int sq= a*a;
		System.out.println("The Square of the Number is"+" "+sq);
		return;
	}

	public static void main(String[] args) {
		System.out.println("The Main Starts...");
		Sample1.square(9);
		Sample1.square(11);
		System.out.println("The Main Ends...");
	}

}
