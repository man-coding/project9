package abstractex;

public class Quiz01 {

	public static void main(String[] args) {

		Avante avante = new Avante();
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnOff();
		System.out.println();

		Sonata sonata = new Sonata();
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnOff();
	}

}

abstract class Car {

	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnOff();

}

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
}
