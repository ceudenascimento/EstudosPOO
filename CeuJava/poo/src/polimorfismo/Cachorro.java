package polimorfismo;

public class Cachorro extends Animal{
	
	public Cachorro() {
		
	}
	
	public Cachorro(String _nome, String _corpelo, String _tipoanimal) {
		super(_nome, _corpelo, _tipoanimal);
	}
	@Override
	public void andar() {
		System.out.println("Cachorro está andando");
	}
	@Override
	public void alimentar(String comida) {
		System.out.println("O cachorro está comendo "+comida);
	}
	@Override
	public void alimentar(String comida, String bebida) {
		System.out.println("O cachorro está comendo "+comida+" e está bebendo "+bebida);
	}
	public void emitirsom() {
		System.out.println("AU AU AU");
	}
}
