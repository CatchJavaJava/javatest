public class Circle {
	private int radius;									//반지름
	
	
	public Circle()										//디폴트 생성자
	{}
	
	public void setRadius(int radius)					//설정자
	{
		this.radius = radius;
	}
	
	public double getArea()								//넓이 반환 메소드
	{
		return (this.radius*this.radius*3.14);
	}
	
	public double getRound()							//둘레 반환 메소드
	{
		return (this.radius*2*3.14);
	}
}
