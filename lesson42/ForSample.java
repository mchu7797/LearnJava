package lesson42;

public class ForSample {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			
			if (i <= 9) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(sum);
	}

}
