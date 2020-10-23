package middle_report;

public class ShowTable {
	public static void newLine(String name, boolean isFirst) { 
		if (!isFirst) {
			System.out.println();
		}
		System.out.println("--- " + name + " ---");
		System.out.println();
	}
	
	public static void showOne() {
		int a = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("%-3d", a); // 구글링했습니다.
			}
			
			System.out.println();
			a++;
		}
	}
	
	public static void showTwo() {
		int a = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("%-3d", a++); // 구글링했습니다.
			}
			System.out.println();
		}
	}
	
	public static void showThree() {
		int a = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == j) {
					System.out.printf("%-3d", a++); // 구글링했습니다.
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
	public static void showFour() {
		for	(char i = 'A'; i <= 'E'; i++) {
			for (char j = 0; j < 5; j++) {
				System.out.printf("%-3c", i + (j * 5)); // 구글링했습니다.
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		newLine("One", true);
		showOne();
		newLine("Two", false);
		showTwo();
		newLine("Three", false);
		showThree();
		newLine("Four", false);
		showFour();
	}

}
