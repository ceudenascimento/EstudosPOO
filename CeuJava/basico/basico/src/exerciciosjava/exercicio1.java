package exerciciosjava;
import java.util.Scanner;
public class exercicio1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numero;
	System.out.print("Digite um número. Vou lhe dizer se ele é positivo ou negativo: ");
	numero = sc.nextInt();
	if (numero>0) {
		System.out.println("O número "+ numero+ " é positivo.");
	}
	else if(numero<0) {
		System.out.println("O número "+ numero+ " é negativo.");
	}
	else {
		System.out.println("O número "+ numero+ " é neutro. Nem positivo e nem negativo. ");
	}
}
}
