package Answer.Problem_2;

public class Vehicle {
	public String color;
	public int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public void show() {
		System.out.println("차량 색상 : " + color);
		System.out.println("차량 최고 속도 : " + speed);
	}
	
}
