package lesson72;

class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("x=" + x + ",y=" + y);
	}
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print("색=" + color + ",");
		showPoint();
	}
}

public class ColorPointModified {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		ColorPoint cp = new ColorPoint(5, 6, "BLUE");
		cp.showColorPoint();
	}

}