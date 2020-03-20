package encapsulationtopic;

class A{
	private int a;
	
	A(int a){
		this.a=a;
	}
	
	public int getA(){
		return a;
	}
	
	public void setA(int a){
		this.a=a;
	}
}

public class Tester1 {

	public static void main(String[] args) {
		A rv = new A(90);
        System.out.println(rv.getA());
        rv.setA(190);
        System.out.println(rv.getA());
	}

}
