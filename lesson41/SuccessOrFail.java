package lesson41;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		System.out.println("2020E8534 �߹μ�");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		
		if (score >= 80) {
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		}
		scanner.close();
	}

}
