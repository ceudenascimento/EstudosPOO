package exerciciosjava;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu sexo: F ou M: ");
		char sexo = sc.next().charAt(0);
		if (sexo=='f' || sexo=='F') {
			System.out.println("Feminino");
		}
		else if(sexo=='m' || sexo=='M') {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Letra inválida");
		}
	}
}
