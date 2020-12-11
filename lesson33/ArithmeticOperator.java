package lesson33;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2020E8534 추민석");
		System.out.print("정수 입력 : ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.print(second + "초입니다. ");
		
		scanner.close();
	}

}
