package fundamentos3;

public class exercicio6 {
public static void main(String[] args) {
	String exemplo[]= {"a", "vida", "é", "bela"};
	for(String i : exemplo) {
		i = i+" ";
		System.out.print(i.toUpperCase());
	}
}
}
