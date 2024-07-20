package encapsulamento;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int vacinado = 0;
		Pet p1 = new Pet();
		Scanner sc = new Scanner(System.in);

		System.out.println("HORA DE PREENCHER A CERTIDÃO DE NASCIMENTO DO SEU PET");
		System.out.print("Digite o nome do seu pet: ");
		p1.setNome(sc.nextLine());
		System.out.print("Digite o nome do DONO do seu pet: ");
		p1.setNomeDono(sc.nextLine());
		System.out.print("Digite o tipo do seu pet: ");
		p1.setTipo(sc.nextLine());
		System.out.print("Digite a idade do seu pet: ");
		p1.setIdade(sc.nextInt());
		sc.nextLine();
		System.out.println("Quem é o padrinho do seu pet: ");
		p1.setPadrinho(sc.nextLine());
		System.out.print("Digite a cor do seu pet: ");
		p1.setCor(sc.nextLine());
		System.out.println("Digite o signo do seu pet: ");
		p1.setSigno(sc.nextLine());
		System.out.println("Seu pet é vacinado? Se sim, digite 1, se não, digite qualquer outro número: ");
		vacinado = sc.nextInt();
		if (vacinado == 1) {
			p1.setVacinado(true);
		} else {
			p1.setVacinado(false);
		}

		sc.close();
	}
}
