package staticNonstaticExample;

public class Bank {
	
	int balance;
	
	void balance(){
		System.out.println("Your Account balane is "+balance);
	}
	
	void deposit(int depositAmount){
		if(depositAmount>=0){
		balance = balance + depositAmount;
		System.out.println("You have deposited Rs "+depositAmount);
		System.out.println("Your account balance now is "+balance);
		}
		else{
	    System.out.println("Deposit amount should be greater than zero..!!");	
		}	
	}
	void withdrawal(int withrawalAmt){
		if(withrawalAmt>balance){
			System.out.println("Insufficient Funds..");
		}
		else{
			balance = balance - withrawalAmt;
			System.out.println("Balance after withrawal is "+balance);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to My Bank...");
		Bank rv = new Bank();
		rv.balance();
		rv.deposit(-20);
		rv.deposit(1000);
		rv.withdrawal(20000);
		rv.withdrawal(500);

	}

}
