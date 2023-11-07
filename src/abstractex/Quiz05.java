package abstractex;

import java.util.ArrayList;

public class Quiz05 {

	public static void main(String[] args) {

		ArrayList<Animal3> list = new ArrayList<Animal3>(); // 부모타입의 리스트 생성

		list.add(new Human3());
		list.add(new Tiger3());

		for (int i = 0; i < list.size(); i++) {

			Animal3 animal3 = list.get(i); // 부모타입으로 요소를 꺼낸다.

			animal3.sleep();
			animal3.move();

			if (animal3 instanceof Human3) { // 실제 인스턴스의 타입 확인

				Human3 human3 = (Human3) animal3; // 다운캐스팅
//				human3.sleep();    -> 위에 부모형에서 바로 쓰면 됨.
//				human3.move();
				human3.readBook();

				System.out.println();

			} else if (animal3 instanceof Tiger3) {

				Tiger3 tiger3 = (Tiger3) animal3;
//				tiger3.sleep();
//				tiger3.move();
				tiger3.hunting();
			}
		}
		System.out.println();
		for (Animal3 animal3 : list) { // 람다식

			animal3.sleep();
			animal3.move();

			if (animal3 instanceof Human3) {

				Human3 human3 = (Human3) animal3;
				human3.readBook();

				System.out.println();
			} else if (animal3 instanceof Tiger3) {

				Tiger3 tiger3 = (Tiger3) animal3;
				tiger3.hunting();
			}
		}
	}

}

abstract class Animal3 {

	public abstract void move(); // 자식클래스마다 다르게 사용하는 기능은 추상메소드 선언

	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
}

class Human3 extends Animal3 {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}

}

class Tiger3 extends Animal3 {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");

	}
}