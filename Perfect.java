/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int p = Integer.parseInt(args[0]);
		String answer = args[0] + " is a perfect number since " + args[0] + " = 1";
		int sum = 0;

		if (p==0) {
			System.out.println("0 is not a perfect number");
		} else {
			for (int i=1; i<p; i++){
				if (p%i==0){
					sum += i;
					if (i!=1){
						answer =answer + " + " + i;
					}	
				}		
			}

			if (p==sum){
				System.out.println(answer);		
			}
			else {
				System.out.println(args[0] + " is not a perfect number");	
			}
	}

	}
}	
