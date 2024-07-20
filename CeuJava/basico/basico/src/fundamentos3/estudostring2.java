package fundamentos3;

public class estudostring2 {
public static void main(String[] args) {
	String str = "Hello";
	String resultado = str.replace("l", "w");
	System.out.println(resultado);
	//a variável resultado receberá a string "Hewwo"
	
	String str2="oi"; String texto = str+"mundo";
	System.out.println(texto);
	
	//quando um dos operadores não for uma string o  java automaticamente realiza a conversão do tipo
	//para uma representação de string. Exemplo:
	int tres =3; 
	String resultadoFinal=3+"palavra"+tres;
	System.out.println(resultadoFinal);
	
}
}
