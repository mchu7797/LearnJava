package lesson111;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args)
	{
		System.out.println("2020E8534 추민석");
		FileReader reader;
		try	{
			reader = new FileReader("c:\\windows\\system.ini");
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
