package lesson73;

class Shape {
	public Shape next;
	
	public Shape() { next = null; }
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	private static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		Line line = new Line();
		paint(line);         // 15번 라인 실행
		paint(new Shape());  //  8번 라인 실행
		paint(new Line());   // 15번 라인 실행
		paint(new Rect());   // 22번 라인 실행
		paint(new Circle()); // 29번 라인 실행
	}
}
