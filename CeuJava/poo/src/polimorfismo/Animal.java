package polimorfismo;

public abstract class Animal {
	public String nome;
	public String corpelo;
	public String tipoanimal;
	
	public Animal() {
		
	}
	public Animal(String _nome, String _corpelo, String _tipoanimal) {
		this.nome=_nome;
		this.corpelo=_corpelo;
		this.tipoanimal=_tipoanimal;
	}
	public void andar() {}
	public void emitirsom() {}
	public void alimentar(String comida) {}
	public void alimentar(String comida, String bebida) {}
}
