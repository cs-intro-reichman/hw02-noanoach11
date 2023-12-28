/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		for (int y=2;y<a+2;y++){

			if (y%2==0) {
				for (int i=0; i<a; i++){
					System.out.print("* ");
				}
			} else {
				for (int x=0;x<a;x++) {
					System.out.print(" *");
				}
			}
			System.out.println();	
		}	
	}
}
