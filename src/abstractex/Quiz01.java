package abstractex;

public class Quiz01 {

	public static void main(String[] args) {

		Avante avante = new Avante();
		avante.drive();
		avante.stop();
		avante.turnOff();
		System.out.println();

		Sonata sonata = new Sonata(); // 부모타입으로 형변환해도 4개타입 모두 사용가능.(자식의 다른 기능을 쓰려면 형변환하면 안됨)
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnOff();

	}

}

abstract class Car {

	// 추상메소드 선언
	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnOff();

}

//아반떼 클래스
class Avante extends Car {

	public void start() {
		System.out.println("아반테 시동을 켭니다.");
	}

	public void drive() {
		System.out.println("아반테 달립니다.");
	}

	public void stop() {
		System.out.println("아반테 멈춥니다.");
	}

	public void turnOff() {
		System.out.println("아반테 시동을 끕니다.");
	}

}

//소나타 클래스
class Sonata extends Car {

	public void start() {
		System.out.println("소나타 시동을 켭니다.");
	}

	public void drive() {
		System.out.println("소나타 달립니다.");
	}

	public void stop() {
		System.out.println("소나타 멈춥니다.");
	}

	public void turnOff() {
		System.out.println("소나타 시동을 끕니다.");
	}

	public void showInfo() {
		System.out.println("소나타");
	}
}
