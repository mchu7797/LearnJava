package lesson93;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		while (st.hasMoreTokens()) 
			System.out.println(st.nextToken());
	}
}
