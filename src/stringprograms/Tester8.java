package stringprograms;

public class Tester8 {

	public static void main(String[] args) {
		String s = "malayalam";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--){
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
		if(s.equals(s1)){
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not palindrome..");
		}

	}

}
