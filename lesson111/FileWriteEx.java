package lesson111;

import java.io.*;
import java.util.*;

public class FileWriteEx {
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		Scanner scanner = new Scanner(System.in);
		FileWriter writer;
		
		try {
			writer = new FileWriter("c:\\test.txt");
			while(true) {
				String line = scanner.nextLine();
				if (line.length() == 0) {
					break;
				}
				
				writer.write(line, 0, line.length());
				writer.write("\r\n", 0, 2);
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}
