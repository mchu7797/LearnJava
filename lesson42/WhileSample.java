package lesson42;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		System.out.println("2020E8534 �߹μ�");
		
		int count = 0, sum = 0, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� ���� �ּ���.");
		
		n = scanner.nextInt();
		
		while (n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		
		if (count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			System.out.println("����� ������ " + count + "���̸�");
			System.out.println("����� " + (double)sum / count + "�Դϴ�");
		}
		
		scanner.close();
	}

}
