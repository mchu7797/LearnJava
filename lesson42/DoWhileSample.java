package lesson42;

public class DoWhileSample {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c + 1);
		} while (c <= 'z');
	}

}
