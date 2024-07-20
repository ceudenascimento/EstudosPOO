package exerciciosjava;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.print("Digite o primeiro número: ");
		num1= sc.nextInt();
		System.out.print("Digite o segundo número: ");
		num2= sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3= sc.nextInt();
		if (num1>num2 && num1>num3) {
				System.out.printf("o maior número é %d", num1);
		}
		else if(num2>num1 && num2>num3) {
				System.out.printf("o maior número é %d", num2);
		}
		else if(num3>num1 && num3>num2){
			System.out.printf("o maior número é %d", num3);
		}
		else {
			System.out.println("Não existe um maior número.");
		}

	}

}
