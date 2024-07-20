package basico2;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos têm na sua sala? ");
		int quantidadealunos=sc.nextInt();
		int contador=1;
		double total=0;
		while (quantidadealunos<=0) {
			System.out.print("Quantidade inválida! Digite a quantidade de alunos da sua sala: ");
			quantidadealunos=sc.nextInt();
		}
		while (contador<=quantidadealunos) {
			System.out.print("digite a nota do aluno "+contador+": ");
			double valor = sc.nextDouble();
			while(valor<0 || valor>10) {
				System.out.printf("Nota inválida!!! Digite a nota válida do aluno %d: ", contador);
				valor=sc.nextDouble();
			}
			total=total+valor;
			contador=contador+1;
			
		}
		total=total/quantidadealunos;
		System.out.printf("A média da turma é %.1f", total);
		sc.close();
	}
}
