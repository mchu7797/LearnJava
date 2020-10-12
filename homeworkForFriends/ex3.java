package homeworkForFriends;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input first integer: ");
		int a = scanner.nextInt();
		System.out.print("Input second integer: ");
		int b = scanner.nextInt();
		
		if (a > b) {
			System.out.println(a + " > " + b);
		}
		if (a < b) {
			System.out.println(a + " < " + b);
		}
		if (a == b) {
			System.out.println(a + " == " + b);
		}
		if (a >= b) {
			System.out.println(a + " >= " + b);
		}
		if (a <= b) {
			System.out.println(a + " == " + b);
		}
		if (a != b) {
			System.out.println(a + " != " + b);
		}
		
		scanner.close();
	}
}
