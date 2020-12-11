package lesson6;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "작자 미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}
