package poobasico;

public class Honda extends Carro{
	private String motor;
	
	public Honda() {
	}
	
	 public Honda(String motor, String cor, double valor){
		 super(cor, valor);//
		 this.motor=motor;
	 }
}
