package array;

public class array1 {
	public static void main(String[] args) {
		/*maneiras de declarar um array
		 * int[]numeros1 = {1, 2, 3, 4, 5, 6} OU
		 * int numeros2[] = {1, 2, 3, 4, 5, 6,} */
		
		int[] intArray = {69, 24, 24, 69};
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" "); //percorrendo todo o array
		}
		
	}
}
