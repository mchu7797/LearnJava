package lesson6;

import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		Book[] books = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < books.length; i++)
		{
			System.out.print("제목 : ");
			String title = scanner.nextLine();
			
			System.out.print("저자 : ");
			String author = scanner.nextLine();
			
			books[i] = new Book(title, author);
		}
		
		for(int i = 0; i < books.length; i++)
		{
			System.out.print("(" + books[i].title + ", " + books[i].author + ")");
		}
		
		scanner.close();
	}

}
