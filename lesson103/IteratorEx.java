package lesson103;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		Iterator<Integer> it = v.iterator();
		
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		it = v.iterator();
		
		int sum = 0;
		
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		
		System.out.println("벡터에 있는 정수 합 : "+ sum);
	}

}
