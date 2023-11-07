package findex;

//final 메소드
public class Ex03 {

	public static void main(String[] args) {

	}

}

class Parents {
	final void method1() { // final 메소드 선언 -> 재정의할 수 없다.

	}

	void method2() {

	}
}

class Child extends Parents {

//	final void method1() { // final 메소드라 재정의 불가. 에러
//
//	}

	@Override
	void method2() {
		super.method2();
	}

}
