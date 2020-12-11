package lesson93;

class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj; 
		if (x == p.x && y == p.y) { return true; }
		else { return false; }
	}
}

class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
	
		if (width * height == r.width * r.height) {
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
	
		if(a == b) {
			System.out.println("a==b");
		}
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		
		Rect d = new Rect(2, 3);
		Rect e = new Rect(3, 2);
		Rect f = new Rect(3, 4);
	
		if(d.equals(e)) {
			System.out.println("d==e");
		}
		if(d.equals(f)) {
			System.out.println("d is equal to f");
		}
		if(e.equals(f)) {
			System.out.println("e is equal to f");
		}
	}
}

