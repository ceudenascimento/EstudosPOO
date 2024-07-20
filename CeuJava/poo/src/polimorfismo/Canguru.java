package polimorfismo;

public class Canguru extends Animal{
	
	public Canguru() {
		
	}
	public Canguru(String _nome, String _corpelo, String _tipoanimal) {
		super(_nome, _corpelo, _tipoanimal);
	}
	@Override
	public void andar() {
		System.out.println("Canguru está pulando");
	}
	public void emitirsom() {
		System.out.println("PULANDO PULANDO PULANDO");
	}
}
