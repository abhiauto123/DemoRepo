package interfaceexamples;

interface TV{
	void dispaly();
	void channelNo(int a);
	void sound();
}

class Onida implements TV{

	@Override
	public void dispaly() {
		System.out.println("Onida diaply");
		
	}

	@Override
	public void channelNo(int a) {
		System.out.println("Channel No "+a);
		
	}

	@Override
	public void sound() {
		System.out.println("Onida sound..");
		
	}
	
	
	
}


class Sony implements TV{

	@Override
	public void dispaly() {
		System.out.println("Sony diaply");
		
	}

	@Override
	public void channelNo(int a) {
		System.out.println("Sony Channel "+a);
		
	}

	@Override
	public void sound() {
		System.out.println("Sony Sound..");
		
	}
	
	
}

public class Tester1 {

	public static void main(String[] args) {
		Onida o = new Onida();
		o.dispaly();
		o.channelNo(99);
		o.sound();
		
		Sony s = new Sony();
		s.dispaly();
		s.channelNo(199);
		s.sound();
				

	}

}
