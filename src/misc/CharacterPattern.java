package misc;

public class CharacterPattern {

	public static void main(String[] args) {
		for(char a = 'A';a<='H';a++){
			for(char b = 'A';b<=a;b++){
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
