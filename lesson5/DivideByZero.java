package lesson5;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		Scanner scanner = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("나뉨수를 입력하시오 :");
		dividend = scanner.nextInt();
		System.out.print("나눗수를 입력하시오 :");
		divisor = scanner.nextInt();
		System.out.println(dividend + "를 " + divisor + "로 나누면 몪은 " + dividend / divisor + "입니다.");
		scanner.close();
	}

}
