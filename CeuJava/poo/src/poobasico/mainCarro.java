package poobasico;

public class mainCarro {

	public static void main(String[] args) {
		Carro c1=new Carro("amarelo", "moura", 250000.00);
		
		c1.desligar();
		c1.desligar();
		c1.ligar();
		c1.desligar();
		c1.desligar();
		c1.ligar();
		c1.qualestado();
		
		Honda carroHonda = new Honda("motorola", "Amarelo", 250000.00);
	}

}
