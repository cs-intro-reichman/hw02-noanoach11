/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		int finalSum = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		String common = "0";


		for (int i=0;i<t;i++){
			boolean girl = false;
			boolean boy = false;
			int sum = 0;

			while (!girl || !boy) {
				double r = Math.random();

				if (r>0.5){
					sum += 1;
					girl = true;
				}

				if (r<0.5){
					sum += 1;
					boy = true;
				}	
			}

			finalSum = finalSum + sum;
			if      (sum==2)  c2 = c2+1;
			else if (sum==3)  c3 = c3+1;
			else              c4 = c4+1;				
		}

		if      (c2>c3 && c2>c4)   common = "2";	
		else if (c3>c2 && c3>c4)   common = "3";
		else if (c4>c2 && c4>c3)   common = "4 or more";
		else {
			if  (c2==c3 || c2==c4) common = "2";
			if  (c3==c4) common = "3";
		}
		
		System.out.println("Average: " + (finalSum/t) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + c2);
		System.out.println("Number of families with 3 children: " + c3);
		System.out.println("Number of families with 4 or more children: " + c4);
		System.out.println("The most common number of children is " + common + ".");

		}

	}
	

