package lesson72;

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

public class InstanceOfEx {
	private static void compareInstance(Person p) {
		if (p instanceof Person) {
			System.out.println("PERSON 인스턴스입니다.");
		}
		if (p instanceof Student) {
			System.out.println("STUDENT 인스턴스입니다.");
		}
		if (p instanceof Researcher) {
			System.out.println("RESEARCHER 인스턴스입니다.");
		}
		if (p instanceof Professor) {
			System.out.println("PROFESSOR 인스턴스입니다.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("2020E8534 추민석");
		
		System.out.println("new Student() :");
		compareInstance(new Student());
		System.out.println("new Researcher() :");
		compareInstance(new Researcher());
		System.out.println("new Professor() :");
		compareInstance(new Professor());
	}

}
