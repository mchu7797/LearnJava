package lesson32;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2020E8534 �߹μ�");
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		
		String name = scanner.next();
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next();
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble();
		System.out.print("�����Դ� " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean();
		System.out.println("���� ���δ�" + single + "�Դϴ�. ");
		
		scanner.close();
	}

}
