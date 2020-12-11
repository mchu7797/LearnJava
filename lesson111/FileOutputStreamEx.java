package lesson111;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		byte b[] = {7, 51, 3, 4, -1, 24};
		
		try {
			FileOutputStream stream = new FileOutputStream("C:\\test.out");
			
			for (int i = 0; i < b.length; i++) {
				stream.write(b[i]);
			}
			
			stream.close();
		} catch(IOException e) {
			System.out.println("C:\\test.out에 저장할 수 없었습니다. 경로명을 확인해주십시오.");
			
			return;
		}
		
		System.out.println("C:\\test.out을 저장하였습니다.");
	}

}
