package lesson41;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		
		System.out.print("학년을 입력하세요(1~4): ");
		int grade = scanner.nextInt();
		
		if (score >= 60) {
			// 60점 이상
			if (grade != 4) {
				System.out.println("합격!");
			} else if(score >= 70) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격!");
			}
		} else {
			System.out.println("불합격!");
		}
		
		scanner.close();
	}

}
