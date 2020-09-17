package lesson33;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		System.out.println("2020E8534 Ãß¹Î¼®");
		
		int a = 3, b = 3, c = 3;
		
		a += 3;
		b *= 3;
		c %= 2;
		
		System.out.println("a:" + a + " b:" + b + " c:" + c);
		
		int d = 3;
		a = d++;
		System.out.println("a:" + a + " d:" + d);
		a = ++d;
		System.out.println("a:" + a + " d:" + d);
		a = d--;
		System.out.println("a:" + a + " d:" + d);
		a = --d;
		System.out.println("a:" + a + " d:" + d);
	}

}
