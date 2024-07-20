package fundamentos3;

import java.util.Scanner;

public class exercicio5 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Digite o texto para eu pôr ele em caps lock: ");
	String texto = sc.nextLine();
	System.out.println(texto.toUpperCase());
}
}
