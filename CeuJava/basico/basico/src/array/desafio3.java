package array;

import java.util.Arrays;

public class desafio3 {
	public static void main(String[] args) {
		int num3[] = { 20, 17, 22, 18, 36, 57, 33 };
		int num4[] = new int[num3.length];
		int x = 0;
		for (int i = num3.length - 1; i > -1; i--) {
			System.out.print(num3[i] + " ");
			num4[x] = num3[i];
			x++;
		}

		System.out.print("\nValores guardados no array num4: ");
		for (int k = 0; k < num4.length; k++) {
			System.out.print(num4[k] + " ");
		}
		Arrays.sort(num4);//ordena o array em ordem crescente
		System.out.print("\nValores guardados no array num4 em ordem crescente: ");
		for (int l = 0; l < num4.length; l++) {
			System.out.print(num4[l] + " ");
		}
	}
}
