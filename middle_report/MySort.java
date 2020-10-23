package middle_report;

public class MySort {
	private static void sort(int[] array) {
		int temp;
		
		for (int i = (array.length - 1); i > 0; i--) {
			for(int j = 0; j < i; i++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != (array.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] myPhone = { 0, 1, 0, 3, 1, 6, 9, 8, 0, 7, 7 };
		
		System.out.println("-- BEFORE --");
		printArray(myPhone);
		System.out.println("-- AFTER --");
		sort(myPhone);
		printArray(myPhone);
	}

}
