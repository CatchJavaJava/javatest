package Answer.Problem_2;

public class Car extends Vehicle {
	public int displacement;
	public int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	@Override
	public void show() {
		System.out.println("차량 색상 : " + color);
		System.out.println("차량 최고 속도 : " + speed);
		System.out.println("차량 배기량 : " + displacement);
		System.out.println("차량 기어 : " + gears);
	}

}
