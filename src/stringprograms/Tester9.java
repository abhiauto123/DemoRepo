package stringprograms;

public class Tester9 {

	public static void main(String[] args) {
		String s = "abcabcabcabc";
		int count = 0;
		for (int i = 0; i<=s.length()-1; i++){
			if(s.charAt(i)=='a'){
			  count++;	
			}
			
		}
		System.out.println(count);

	}

}
