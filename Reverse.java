/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		char midLet = '+';

		if (s.length()%2==0){
			for (int i= s.length()-1; i>=0 ;i--){
				System.out.print(s.charAt(i));
				if (i==((s.length()-1)/2)) {
					midLet = s.charAt(i);
				} 
			}
		}

		else {
			for (int i= s.length()-1; i>=0 ;i--){
				System.out.print(s.charAt(i));
				if (i==(s.length()/2)) {
					midLet = s.charAt(i);
				} 
			}

		}

		System.out.println();
		System.out.print("The middle character is " + midLet);
	}
}
