package lesson6;

public class CircleArray {
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		Circle[] c;
		c = new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print((int)c[i].getArea() + " ");
		}
	}

}
