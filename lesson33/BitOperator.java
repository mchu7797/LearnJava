package lesson33;

public class BitOperator {
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b));
		System.out.printf("%04x\n", (short)(a | b));
		System.out.printf("%04x\n", (short)(a ^ b));
		System.out.printf("%04x\n", (short)(~a));
		
		// c = 0x14, d = 0xf8
		byte c = 20;
		byte d = -8; 
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.printf("%x\n", (d >>> 2));
	}
}
