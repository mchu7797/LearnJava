package lesson5;

import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("나뉨수를 입력하시오 :");
			int dividend = scanner.nextInt();
			System.out.print("나눗수를 입력하시오 :");
			int divisor = scanner.nextInt();
			
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몪은 " + dividend / divisor + "입니다.");
			} catch	(ArithmeticException e) {
				System.out.println("0으로 나누어질 수 없습니다.");
			}
		}
	}

}
