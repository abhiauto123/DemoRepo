package interfaceexamples;

interface Switch{
	void on();
	void off();
}

class Fan implements Switch{

	@Override
	public void on() {
		System.out.println("Turn Fan On..");
		
	}

	@Override
	public void off() {
		System.out.println("Turn Fan Off.. ");
		
	}
	
}

class Bulb implements Switch{

	@Override
	public void on() {
		System.out.println("Turn Bulb on..");
		
	}

	@Override
	public void off() {
		System.out.println("Turn Bulb off...");
		
	}
	
}

class MyRoom{
	static void mySwitch(Switch sw){
		sw.off();
		sw.on();
	}
}

class BulbTester {

	public static void main(String[] args) {
		MyRoom.mySwitch(new Bulb());
		MyRoom.mySwitch(new Fan());

	}

}
