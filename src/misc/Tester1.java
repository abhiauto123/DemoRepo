package misc;

public class Tester1 {

	public static void main(String[] args) {
		int num = 256;
		int res=0;
		while (num>0) {
			int temp = num%10;
			res = res + temp;
			num = num/10;
			
		}
       System.out.println("the sum of the digits is :"+res);
       
	}

}
