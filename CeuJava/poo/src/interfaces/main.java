package interfaces;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		triatleta a1 = new triatleta("Tia Romba", 18);
		Scanner sc = new Scanner(System.in);
		int acao=1;
		while(acao!=0) {
		System.out.println("MENU - DIGITE:\n1 = CORRER\n2 = NADAR\n3 = PEDALAR\n4 = DESCANSAR\n0 = SAIR");
		acao=sc.nextInt();
		if(acao==1) {
			a1.correr();
			System.out.println("Deseja continuar? QUALQUER TECLA = SIM\n0 = NÃO");
			acao=sc.nextInt();
		}
		else if(acao==2) {
			a1.nadar();
			System.out.println("Deseja continuar? QUALQUER TECLA = SIM\n0 = NÃO");
			acao=sc.nextInt();
		}
		else if(acao==3) {
			a1.pedalar();
			System.out.println("Deseja continuar? QUALQUER TECLA = SIM\n0 = NÃO");
			acao=sc.nextInt();
		}
		else if(acao==4) {
			a1.descansar();
		}
		else if(acao==0) {
			System.out.println("FIM DO PROGRAMA");
		}
		}
		sc.close();
	}

}
