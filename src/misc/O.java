package misc;

public class O {
	

	public static void main(String[] args) {
		int num = 100;
		int oldnum = num;
		int res = 0;
		while(num>0){
			int temp = num%10;
			res = temp + (res * 10);
			num = num/10;
		}
		
		if(res==oldnum){
			System.out.println( "The number is palindrome..");
		}
		else{
			System.out.println("The number is not a palindrome..");
		}

	}

}
