/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int a = 0;
		int b = 0; 

		do {
			a = (int) ((Math.random()*10));
			if (a>=b){
				System.out.print(a + " ");
				b = a;
			}
			
		}
		while (a>=b);

	}
}
