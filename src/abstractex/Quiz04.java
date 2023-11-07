package abstractex;

import java.util.ArrayList;

public class Quiz04 {

	public static void main(String[] args) {

		ArrayList<Car3> list = new ArrayList<>();

		list.add(new Bus3());
		list.add(new AutoCar3());

		for (Car3 car3 : list) { // 람다식에서는 앞에 부모형 변수 쓰면 됨.(다른 거 써도 2개 다 출력됨)
			// 객체 선언 안 해도 됨.
			car3.run();
			car3.refule();
			if (car3 instanceof Bus3) {
				Bus3 bus3 = (Bus3) car3;
				bus3.takePassenger();
				System.out.println();
			} else if (car3 instanceof AutoCar3) {
				AutoCar3 autoCar3 = (AutoCar3) car3;
				autoCar3.load();
			}

		}
		System.out.println();

		for (int i = 0; i < list.size(); i++) { // 일반형 포문
			Car3 car3 = list.get(i); // 일반형에서는 값을 꺼내오는 식을 써줘야 함.
			car3.run();
			car3.refule();

			if (car3 instanceof Bus3) { // 실제 인스턴스의 타입 확인
				Bus3 bus3 = (Bus3) car3;
				bus3.takePassenger();
				System.out.println();
			} else if (car3 instanceof AutoCar3) {// 실제 인스턴스의 타입 확인
				AutoCar3 autoCar3 = (AutoCar3) car3;
				autoCar3.load();
			}
		}

	}

}

abstract class Car3 {

	public abstract void run();

	public abstract void refule();

}

class Bus3 extends Car3 {

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

class AutoCar3 extends Car3 {

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