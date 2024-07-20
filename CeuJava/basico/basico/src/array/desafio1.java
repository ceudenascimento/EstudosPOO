package array;

import java.util.Scanner;

public class desafio1 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	//array um
	int[] a;
	a = new int[10];
	for(int i=0;i<10;i++) {
		System.out.printf("Digite o %dº valor do array: ", i+1);
		a[i] = sc.nextInt();
	}
	for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
	}
	//array dois
	int[] b;
	b = new int[10];
	for(int k=0;k<10;k++) {
		System.out.printf("\nDigite o %dº valor do array dois: ", k+1);
		b[k] = sc.nextInt();
	}
	for(int l=0;l<b.length;l++) {
			System.out.print(b[l]+" ");
	}
	//array três
	int[] c;
	c = new int[10];
	for(int m=0;m<10;m++) {
		System.out.printf("\nDigite o %dº valor do array três: ", m+1);
		c[m] = sc.nextInt();
	}
	for(int n=0;n<c.length;n++) {
			System.out.print(c[n]+" ");
	}

}
}
