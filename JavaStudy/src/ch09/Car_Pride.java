package ch09;

public class Car_Pride extends Car {
	public void move(int x, int y) {
		System.out.printf("%s, %s 프라이드 이동", x, y);
	}
	public void stop() {
		System.out.println("프라이드 멈춤");
	}

}
