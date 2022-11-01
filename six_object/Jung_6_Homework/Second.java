import java.util.*;


public class Second {
	Average av = new Average();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int a, b, c;	
		
		System.out.print("첫 번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		b = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		c = sc.nextInt();
		
		System.out.println("세 정수의 평균 : " + av.getAverage(a, b, c));
	}
}

class Average {
	
	public Average()
	{

    }
	
	public double getAverage(int x, int y, int z)
	{
		return (x+y+z)/3;
	}
}