package lesson6;

public class BookFixed {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}

	public BookFixed() {
		this("", "");
		System.out.println("생성자 호출됨");
	}

	public BookFixed(String title) {
		this(title, "작자미상");
	}

	public BookFixed(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String [] args) {
		System.out.println("2020E8534 추민석");
		
		BookFixed littlePrince = new BookFixed("어린왕자", "생텍쥐페리");
		BookFixed loveStory = new BookFixed("춘향전");
		BookFixed emptyBook = new BookFixed();		
		
		loveStory.show();
	}
}
