package exerciciosjava;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		double nota1=sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		double nota2=sc.nextDouble();
		double media=(nota1+nota2)/2;
		System.out.println(media);
		if (media>=7) {
			System.out.println("Você foi aprovado por média");
		}
		else if (media>=5 && media<7) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
	}
}
