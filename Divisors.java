/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);

		if(x==0){
			System.out.println("There is No divisors for 0.");
		}

		for (int i=1; i<=x; i++){
			if (x%i==0){
				System.out.println(i);
			}
		}
	}
}
