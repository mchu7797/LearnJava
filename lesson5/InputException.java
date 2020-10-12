﻿package lesson5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0, n = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				n = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				scanner.next();
				i--;
				continue;
			}
			
			sum += n;
		}
		
		System.out.println("합은 : " + sum);
		scanner.close();
	}

}
