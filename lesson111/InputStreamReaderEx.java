package lesson111;

import java.io.*;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		InputStreamReader reader;
		FileInputStream stream;
		
		try {
			stream = new FileInputStream("c:\\hangul.txt");
			reader = new InputStreamReader(stream, "MS949");
			int c;
			
			System.out.println("인코딩 문자 집합은 " + reader.getEncoding());
			
			while ((c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			
			reader.close();
			stream.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
