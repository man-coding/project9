package abstractex;

//추상클래스 만들고 상속받기
public class Ex01 {

	public static void main(String[] args) {

		// Computer computer = new Computer(); Computer는 추상클래스라서 인스턴스를 만들 수 없다(직접 사용할 수
		// 없다)

		DeskTop desktop = new DeskTop();
		NoteBook notebook = new NoteBook();

		desktop.turnOn();
		desktop.turnOff();
		desktop.display();
		desktop.typing();

		notebook.turnOn();
		notebook.turnOff();
		notebook.display();
		notebook.typing();

	}

}

abstract class Computer {
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	public abstract void display(); // {} 구현부가 없다. ;로 마무리. ->자식클래스에서 재정의된 기능으로 사용 가능

	public abstract void typing();

}

class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop Display()"); // 본인의 비즈니스에 맞게 내용 작성.

	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");

	}

}

class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook Display()");

	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");
	}

}