package fundamentos3;

import java.util.StringTokenizer;

public class estudstring4 {
public static void main(String[] args) {
	//converter todos os caracteres da string eu maiusculo usa-se o toUpperCase()
	String str = "oii alooo";
	String resultado = str.toUpperCase();
	System.out.println(resultado);
	//converter em minusculo
	String str2= " OIOIOIOIOIOI ";
	String resultado2 = str2.toLowerCase();
	System.out.println(resultado2);
	
	//método para tirar os espaços em branco ao final  eao inicio de uma string
	String resultado3 = str2.trim();
	System.out.println(resultado3);
	
	//para extrair um caractere de uma string usa-se o método charAt()
	char c = str.charAt(6);//pegando o caractere da posição 6 +
	System.out.println(c);
	
	//para comparar se duas string são iguais usamos o método equals
	//para comparar se duas string são iguais sem considerar maiusculas e minusculas usamos o equalsIgnoreCase
	String s1="OI";
	String s2="oi";
	boolean b1 = s1.equals("Hello");
	boolean b2 = s1.equals(s2);
	boolean b3 = s1.equalsIgnoreCase(s2);
	boolean b4 = s1.equalsIgnoreCase("azul");
	System.out.println(b1+" "+b2+" "+b3+" "+b4);
	
	//o tamanho de uma string pode ser obtido pelo método length. esse método retorna um int
	int tamanho = str.length();
	System.out.println(tamanho);
	
	//o indexOf retorna o índice da primeira ocorrência de l no valor da string str
	int pos = str.indexOf("l");
	System.out.println(pos);
	
	String valor = "CDD - Java";
	System.out.println(valor.endsWith("Java")); //se termina com Java
	System.out.println(valor.startsWith("C")); //se começa com C
	System.out.println(valor.startsWith("DD", 1)); //se a partir da posição 1 tem dois DD
	
	//contando quantas palavras tem no texto usando o StringTokenizer
	StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas iremos desistir sempre");
	System.out.println(exemplo.countTokens());
	/*A classe StringTokenizer divide uma string em partes chamadas tokens que são separados por
	 * espaços, vírgulas, -, : */
	
}
}
