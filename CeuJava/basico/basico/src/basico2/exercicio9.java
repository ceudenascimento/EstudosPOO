package basico2;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		System.out.print("Digite a quantidade de alunos da sala: ");
		int alunos = sc.nextInt();
		for (int contador = 1; contador <= alunos; contador++) {
			System.out.print("Digite a nota do aluno " + contador + ": ");
			double nota = sc.nextDouble();
			total = total + nota;
		}
		total = total / alunos;
		System.out.printf("A média da turma é: %.1f", total);
	}
}
