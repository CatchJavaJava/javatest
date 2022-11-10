public class Vehicle {
	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public void show()
	{ System.out.println("자동차 색상 : " + color + "자동차 속도 : " + speed); }
}

class Car extends Vehicle{
	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	@Override
	public void show()
	{ System.out.println("자동차 색 : " + color + "  자동차 속도 : " + speed + " 자동차 배기량 : " + displacement + " 자동차 기어 단수 : " + gears); }
}