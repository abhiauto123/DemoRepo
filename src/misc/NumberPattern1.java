package misc;

public class NumberPattern1 {
	
	/*
    --------------------------------
	Print the following number pattern :-
	
	1
	12
	123
	1234
	12345
	
    --------------------------------
	*/

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){
			for (int j=1; j<=i ; j++){
				System.out.print(j);
			}
			 System.out.println();   
		}
			

	}

}
