package lesson103;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("apple", "사과");
		map.put("coffee", "커피");
		map.put("night", "밤");
		map.put("fatigue", "피로");
		
		String piro = map.get("fatigue");
		
		System.out.println("fatigue는 " + piro);
	}

}
