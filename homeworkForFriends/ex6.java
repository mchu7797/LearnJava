package homeworkForFriends;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int i = scanner.nextInt();
		if (i % 2 == 0) {
			System.out.println(i + " is an even number.");
		}
		else {
			System.out.println(i + " is an odd number.");
		}
		
		scanner.close();
	}

}
