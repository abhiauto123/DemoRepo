package constructor;



public class Mobile {
	int mobileNo;
	String mobileName;
	double mobileCost;
	
	Mobile(int no, String name, double cost){
		
		mobileNo = no;
		mobileName =name;
		mobileCost = cost;
		display();
		
	}
	
	void display(){
		System.out.println("Mobile Number is"+mobileNo);
		System.out.println("Mobile Name is"+mobileName);
		System.out.println("Mobile Cost is"+mobileCost);
	}

	public static void main(String[] args) {
		System.out.println("Main Starts...");
		Mobile rv = new Mobile(88, "Iphone",5000.00);
		Mobile rv2 = new Mobile(777, "Samsung", 8880.88);
		System.out.println("Main Ends...");
		

	}

}
