package lesson5;

public class CalcDefault {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}
		
		System.out.println("합계 : " + sum);
	}

}
