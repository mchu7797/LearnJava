package lesson103;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String s = scanner.next();
			a.add(s);
		}
		
		scanner.close();
		
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		
		int longestIndex = 0;
		
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).length() > a.get(longestIndex).length()) {
				longestIndex = i;
			}
		}
		
		System.out.println("\n가장 긴 이름은? : " + a.get(longestIndex));
	}

}
