package Demo;

import java.util.*;

public class Main {
	public static void numbergame() {
		Scanner sc = new Scanner(System.in);
		int num = 1+(int)(100*Math.random());
		int k = 5;
		System.out.println("A number is choosen between 1 to 100.");
		System.out.println("You have "+k+" attempts to Guess the number");
		for(int i=0;i<k;i++) {
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			if(n>num) {
				System.out.println("Please guess less than "+n);
			}
			else if(n<num) {
				System.out.println("Please guess greater than "+n);
			}
			else {
				System.out.println("Congratulations!!!. Your Guess is correct");
				break;
			}
		}
		System.out.println("You've exhausted all trails. The correct number was "+num+".");
		sc.close();
	}
	public static void main(String[] args) {
		numbergame();
	}
}
