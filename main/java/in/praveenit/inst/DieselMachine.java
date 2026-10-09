package in.praveenit.inst;

public abstract class DieselMachine {
	
	public DieselMachine() {
		System.out.println("Diesl Con");
	}
	
	public void Start() {
		System.out.println("Machine Starting");
	}
	
	public abstract void fillfuel();

}
