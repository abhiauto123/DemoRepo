package misc;

public class UpsidedownPyramid {

	public static void main(String[] args) {
		
		for(int l=5;l>=1;l--){
			for(int m=5;m>=l;m--){
				System.out.print(" ");
			}
			
			for(int n=1;n<=l;n++){
				System.out.print(" "+n);
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
	        for(int k=1;k<=i;k++){
	        	System.out.print(" "+k);
	        }
	        System.out.println();
		}
	}

}
