package lesson71;

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// 아래의 코드와 같이 super클래스의 private 필드는 접근이 불가능하다.
		// weight = 99;
		setWeight(99); //이와 같이 private 필드는 간접적으로 접근해야 한다.
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		Student s = new Student();
		s.set();
	}

}
