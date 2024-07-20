package polimorfismo;

public class main {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Canguru ca1 = new Canguru();
		Cobra co1 = new Cobra();
		Tubarao t1 = new Tubarao();
		
		c1.emitirsom();
		ca1.emitirsom();
		co1.emitirsom();
		c1.alimentar("Bife");
		c1.alimentar("Bife", "água");

	}

}
