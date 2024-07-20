package fundamentos3;

import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	//compare dois textos e diga se eles são iguais
	System.out.print("Digite o texto1: ");
	String s1 = sc.nextLine();
	System.out.print("Digite o texto2: ");
	String s2 = sc.nextLine();
	boolean iguais = s1.equalsIgnoreCase(s2);
	if(iguais==true) {
		System.out.println("Os dois textos são iguais");
	}
	else {
		System.out.println("Os dois textos não são iguais");
	}
	sc.close();
}
}
