package encapsulationtopic;

class S{
	
	static S s=null;
	private S(){
		System.out.println("Running Private Constructor..");
	}
	
	public static S Demos(){
		if(s==null){
			s= new S();
			return s;
		}
		else{
			
		return s;
		}
	}
}

public class Tester3 {

	public static void main(String[] args) {
		S rv = S.Demos();
	    S rv2= S.Demos();

	}

}
