package homeworkForFriends;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the number of minutes: ");
		int base_minute = scanner.nextInt();
		System.out.println(base_minute + "minutes is approximately");
		
		int year = base_minute / (60 * 24 * 365);
		int days = base_minute % (60 * 24 * 365) / (60 * 24);
		int hours = base_minute % (60 * 24 * 365) % (60 * 24) / 60;
		
		System.out.println("year : " + year);
		System.out.println("days : " + days);
		System.out.println("hours : " + hours);
		
		scanner.close();
	}

}
