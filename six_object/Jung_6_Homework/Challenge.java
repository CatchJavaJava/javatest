import java.util.*;


public class Challenge {
	Circle c = new Circle();
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		int x;
		
		System.out.print("원의 반지름을 입력 : ");
		x = sc.nextInt();
		c.setRadius(x);	
		
		System.out.println("원의 둘레 : " , c.getRound());
        System.out.println("원의 넓이" :  , c.getArea());	
	}
}


class Circle {
	private int radius;	

	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	public double getArea()	
	{
		return (this.radius*this.radius*3.14);
	}
	
	public double getRound()
	{
		return (this.radius*2*3.14);
	}
}
