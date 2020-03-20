package encapsulationtopic;

class Bank{
	private int balance=1000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>0){
		this.balance = this.balance+balance;
		}
		else{
			System.out.println("Invalid Transavtion..");
		}
			
	}
}

public class Tester2 {

	public static void main(String[] args) {
		Bank rv = new Bank();
		System.out.println(rv.getBalance());
		rv.setBalance(-6000);
		rv.setBalance(60000);
		System.out.println(rv.getBalance());

	}

}
