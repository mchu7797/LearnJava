package lesson41;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		System.out.println("2020E8534 �߹μ�");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		int number = in.nextInt();
		
		if ((number % 3) == 0) {
			System.out.println("3�� ����Դϴ�.");
		}
		else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		in.close();
	}

}
