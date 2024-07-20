package Metodos;

public class CalcularMetodos {
	// método por sobrecarga
	public int somar(int a, int b) {
		return a + b;
	}
	public int somar(int a, int b, int c) {
		return a + b + c;
	}
	public int subtrair(int a, int b) {
		return a - b;
	}
	public int subtrair(int a, int b, int c) {
		return a - b - c;
	}
	public int multiplicar (int a, int b) {
		return a*b;
	}
	public int multiplicar(int a, int b, int c) {
		return a*b*c;
	}
	public double dividir(int a, int b) {
		return a/b;
	}
	public double dividir(int a, int b, int c) {
		return a/b/c;
	}
	

}
