package basico1;

import java.util.Scanner;

public class scannerEntrada {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //Iniciando o scanner
	System.out.print("Digite o seu nome: ");
	String nome = sc.nextLine();
	System.out.println("Agora digite a sua idade, "+nome+": ");
	int idade = sc.nextInt();
	System.out.println("Você se chama "+nome+" e você tem "+idade+" anos.");
	//ou
	System.out.printf("Você se chama %s e sua idade é %d", nome, idade); //printf do java
}
}
