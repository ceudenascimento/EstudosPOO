package array;

public class exercicio1 {
public static void main(String[] args) {
	int[] one = {12, 3, 5, 69, 9, 6, 73, 44, 456, 65, 321};
	int[] two = {43, 42, 4, 8, 55, 21, 2, 45};
	 if(two.length>8) {
		 System.out.println("Tamanho do array dois maior que oito");
	 }
	 else if (two.length==8) {
		 System.out.println("Tamanho do array equivale a 8");
	 }
	 else {
		 System.out.println("Tamanho do array dois menor que oito");
	 }
	 System.out.println("Tamanho do array um = "+one.length);
}
}
