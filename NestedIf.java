package lesson41;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("2020E8534 �߹μ�");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt();
		
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		int grade = scanner.nextInt();
		
		if (score >= 60) {
			// 60�� �̻�
			if (grade != 4) {
				System.out.println("�հ�!");
			} else if(score >= 70) {
				System.out.println("�հ�!");
			} else {
				System.out.println("���հ�!");
			}
		} else {
			System.out.println("���հ�!");
		}
		
		scanner.close();
	}

}
