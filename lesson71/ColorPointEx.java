package lesson71;

class Point {
	int x, y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("x=" + x + ",y=" + y);
	}
}

class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print("색=" + color + ",");
		super.x = 10;
		showPoint();
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		// Point에 있는 set, showPoint
		Point p = new Point();
		p.set(1, 2); // Point에서 호출
		p.showPoint(); // Point에서 호출
		
		// ColorPoint에 있는 setColor
		// 상속한 Point에 있는 set
		// 구현은 ColorPoint에서 했지만, Point의 메소드를 호출하는 showColorPoint
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // Point에서 호출
		cp.setColor("RED"); // ColorPoint에서 호출
		cp.showColorPoint(); // ColorPoint, Point에서 호출
	}

}