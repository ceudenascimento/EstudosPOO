package Membros;

public class main {

	public static void main(String[] args) {
		BornDate d1 = new BornDate();
		BornDate d2 = new BornDate();
		d1.dia=12;
		d1.mes=02;
		d1.ano=1991;
		d2.dia=25;
		d2.mes=01;
		d2.ano=1992;
		System.out.println();		System.out.printf("A data de nascimento é %d/%d/%d", d2.dia, d2.mes, d2.ano);
		System.out.printf("A data de nascimento é %d/%d/%d", d1.dia, d1.mes, d1.ano);
}

}
