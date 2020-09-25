package lesson42;

public class NestedLoop {

	public static void main(String[] args) {
		System.out.println("2020E8534 Ãß¹Î¼®");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
