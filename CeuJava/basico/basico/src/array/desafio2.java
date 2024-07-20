package array;

import java.util.Scanner;

public class desafio2 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	double notas[] = new double[5];
	double total=0;
	for (int i=0; i<notas.length;i++) {
		System.out.printf("Digite a nota do %dº aluno: ", i+1);
		notas[i]=sc.nextDouble();
	}
	for(double soma:notas) {
		total=total+soma;
	}
	total=total/notas.length;
	System.out.printf("Média da turma: %.1f", total);
}
}
