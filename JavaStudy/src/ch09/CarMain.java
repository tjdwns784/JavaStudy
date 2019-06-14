package ch09;

public class CarMain {
	
	static void driver(Car c) {
		c.move(10, 10);
		c.stop();
	}
	
	public static void main(String[] args) {
		Car_Pride c1 = new Car_Pride();
		driver(c1);
		Car_ray c2 = new Car_ray();
		driver(c2);
		
	}

}
