package misc;

public class Amstrong {

	public static void main(String[] args) {
		int num = 370;
		int oldnum = num;
		int res = 0;
		
		while (num>0) {
			
			int temp = num % 10;
			res = res + (temp*temp*temp);
			num = num / 10;
		}
         
		if(res == oldnum){
			System.out.println("Armstrong Number..");
		}
		else{
			System.out.println("Not Armstrong...");
		}
	}

}
