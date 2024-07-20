package basico2;

public class exercicio7 {
public static void main(String[] args) {
	for(int i=0; i<100;i++) {
		if(i>50 && i<60) {
			continue;//enquanto o número for maior que 50 e menor que 60 ele volta para o inicio
		}
		System.out.println(i);
	}
}
}
