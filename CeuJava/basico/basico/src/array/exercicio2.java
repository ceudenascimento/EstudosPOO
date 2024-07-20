package array;

public class exercicio2 {
	public static void main(String[] args) {
		int[] num = { 87, 68, 52, 5, 49, 83, 45, 12, 64 };
		int total = 0;

		for (int i : num) {//adiciona o valor de cada elemento ao total
			total = total + i;
		}
		System.out.printf("Total de elementos do array: %d", total);
	}
}
