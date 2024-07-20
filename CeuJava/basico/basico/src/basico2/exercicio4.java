package basico2;

public class exercicio4 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.printf("%d, ", i);
			}
			i = i + 1;
		}
		i = 1;
		System.out.println();
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.printf("%d, ", i);
			}
			i = i + 1;
		}
	}
}
