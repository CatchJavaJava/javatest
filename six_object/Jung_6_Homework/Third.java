import java.util.*;


public class Third {
	BigCheck big = new GetBig();
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		int a, b;
		
		System.out.print("첫 번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		b = sc.nextInt();
		
		System.out.println("더 큰 정수 : " + big.WhichBig(a, b));
	}

}

class GetBig {

	public int WhichBig(int x, int y)
	{
		return (x > y ? x : y);
	}
}
