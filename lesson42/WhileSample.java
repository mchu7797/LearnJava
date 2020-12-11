package lesson42;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		int count = 0, sum = 0, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 적어 주세요.");
		
		n = scanner.nextInt();
		
		while (n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		
		if (count == 0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("평균의 갯수는 " + count + "개이며");
			System.out.println("평균은 " + (double)sum / count + "입니다");
		}
		
		scanner.close();
	}

}
