package fundamentos3;

import java.util.StringTokenizer;
import java.util.Scanner;

public class exercicio3 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	/*faça um programa que a partir de um texto digitado pelo usuario conte o numero de palavras
	 * e exiba o resultado*/
	
	System.out.println("Digite uma frase para eu contar o numero de palavras");
	String texto = sc.nextLine();
	//obs: o sc.next() só lê a primeira palavra
	//o sc.nextLine() lê a linha toda
	StringTokenizer exemplo = new StringTokenizer(texto);
	System.out.println(exemplo.countTokens());
	
	sc.close();
	
	
}
}
