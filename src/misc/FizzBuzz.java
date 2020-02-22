package misc;

public class FizzBuzz {

	public static void main(String[] args) {
		// FizzBuzz Program
		
		for(int i=1;i<=30;i++){
			if(((i%3)==0) && ((i%5)==0)){
				System.out.println("FizzBuzz" +" "+i);
			}
			else if ((i%3)==0){
				System.out.println("Fizz"+" "+i);
			}
			else if ((i%5)==0){
				System.out.println("Buzz"+" "+i);
			}	
		}

	}

}
