package abstractex;

public class Ex02 {

	public static void main(String[] args) {

		Animal animal1 = new Dog(); // 부모로 형변환
		animal1.sound(); // 재정의된 메소드가 호출됨.

		Animal animal2 = new Cat();
		animal2.sound(); // 링크를 따라가도 확인 어려움->런타임에서 확인 가능
	}

}

//동물 추상클래스
abstract class Animal {
	String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다");

	}

	public abstract void sound();
}

//고양이 클래스
class Cat extends Animal {
	public Cat() {

		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
