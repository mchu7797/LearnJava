package lesson113;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		FileReader reader;
		int c;
		
		try {
			reader = new FileReader("C:\\test2.txt");
			BufferedOutputStream outStream = new BufferedOutputStream(System.out, 5);
			
			while ((c = reader.read()) != -1) {
				outStream.write(c);
			}
			
			new Scanner(System.in).nextLine();
			outStream.flush();
			reader.close();
			outStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
