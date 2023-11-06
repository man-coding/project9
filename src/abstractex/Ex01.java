package abstractex;

public class Ex01 {

	public static void main(String[] args) {

	}

}

abstract class Computer {
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	public abstract void display(); // {} 구현부가 없다. ;로 마무리.

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