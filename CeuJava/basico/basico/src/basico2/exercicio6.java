package basico2;

public class exercicio6 {
public static void main(String[] args) {
	for (int i=1;i<100;i++) {
		if(i%3==0) {
			System.out.printf("achei um número divisível por três entre 1 e 100: %d",i);
			break; //assim que achar um número divisível por três ele para o loop
		}
	}
}
}
