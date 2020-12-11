package lesson92;

class Point {
	private int x, y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		Point p = new Point(2, 3);
		print(p);
	}
	
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
}
