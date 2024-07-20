package basico1;

public class OperadorExemplo7 {
public static void main(String[] args) {
	//operador ternário
	int a=3;
	System.out.println(a%2==0? ++a:a++);
	//SE o resto de 3/2 é igual a 0? se sim, ++a(4), se não, a++(3)
}
}
