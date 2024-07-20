package fundamentos3;

public class estudostring3 {
public static void main(String[] args) {
	/*para extrair o texto de uma string pode se usar o método substring que retorna uma nova string que
	 * retorna uma nova string com o trecho selecionado nas posições indicadas. Em java a primeira posição
	 * de uma string é 0. por exemplo:*/
	String str = "hello world";
	String resultado = str.substring(6);
	System.out.println(resultado);
	//nesse exemplo ele a string resultado recebe o texto a partir da posição 6 da str
	
	//também pode se dizer quando ela começa e quanndo termina, ou seja, vai pegar o trecho da string começando
	//da posição x e terminar na y
	String resultado2=str.substring(3, 8);
	System.out.println(resultado2);
	
}
}
