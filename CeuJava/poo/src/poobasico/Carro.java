package poobasico;

public class Carro {
	public String motor;
	public String cor;
	public double valor;
	public boolean estado;
	
	//você pode fazer varios construtores na mesma classe. Nesse caso, tem construtor pra quando for criar instância
	//e não quiser passar os parametros de inicio, quando for passar só a cor de inicio e quando for passar
	//o valor de todos os atributos
	
	public Carro() {// método construtor
		this.estado=false;
	}

	public Carro(String cor) {// método construtor
		this.cor = cor;
		this.estado=false;
		this.estado=false;
	}

	
	public Carro(String cor, double valor) {// método construtor
		this.motor = motor;
		this.cor = cor;
		this.valor = valor;
		this.estado=false;
	}
	
	public Carro(String motor, String cor, double valor) {// método construtor
		this.motor = motor;
		this.cor = cor;
		this.valor = valor;
		this.estado=false;
	}

	public void ligar() {
		if(this.estado==true) {
			System.out.println("O CARRO JÁ ESTÁ LIGADO");
		}
		else {
		System.out.println("CARRO LIGADO!!!");
		this.estado=true;}
	}
	
	public void desligar() {
		if(this.estado==false) {
			System.out.println("O CARRO JÁ ESTÁ DESLIGADO");
		}
		else {
		System.out.println("CARRO DESLIGADO!!!");
		this.estado=false;}
	}
	
	public void qualestado() {
		if(this.estado==false) {
			System.out.println("STATUS DO CARRO: DESLIGADO");
		}else {
			System.out.println("STATUS DO CARRO: LIGADO");
		}
	}
}
