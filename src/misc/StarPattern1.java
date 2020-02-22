package misc;

public class StarPattern1 {
	
	/*
	Print the following star pattern...
	
	*
	**
	***
	****
	*****
	
    */

	public static void main(String[] args) {
		
		for (int i=1; i<=5 ;i ++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}

}
