package fundamentos3;

public class exercicio7 {
public static void main(String[] args) {
	String exemplo[]= {"a", "vida", "é", "bela"};
	for(String i : exemplo) {
		i = i+" ";
		System.out.print(i.toUpperCase());
	}
	System.out.println();
	for(int j = exemplo.length-1; j>=0; j--) {
		System.out.print(exemplo[j].toUpperCase()+" ");
	}
	
}
}
