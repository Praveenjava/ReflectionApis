package in.praveenit.inst;

public class Machine extends DieselMachine{
	
	public Machine() {
		System.err.println("Machine con");
	}

	@Override
	public void fillfuel() {
		System.out.println("Filling fuel tank");
		
	}
	public static void main(String[] args) {
		Machine m = new Machine();
		m.fillfuel();
		m.Start();
	}

}
