package abstractex;

public class Quiz02 {

	public static void main(String[] args) {

		Bus bus = new Bus(); // 부모타입으로 형변환하면 안됨 -> 승객태우는 메소드 사용 못함.
		bus.run(); // 두 개 메소드만 사용할 땐 형변환해도 됨.
		bus.refule();
		bus.takePassenger();

		System.out.println();
		AutoCar autoCar = new AutoCar();
		autoCar.run();
		autoCar.refule();
		autoCar.load();
	}

}

abstract class Car2 {

	public abstract void run();

	public abstract void refule();

}

class Bus extends Car2 {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");

	}

	@Override
	public void refule() {
		System.out.println("천연 가스를 충전합니다.");
	}

	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}

}

class AutoCar extends Car2 {

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refule() {
		System.out.println("휘발유를 주유합니다.");
	}

	public void load() {
		System.out.println("짐을 싣습니다.");
	}

}