import java.util.Scanner;


public class Q4 {
	private static Circle c = new Circle();
	private static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		int r;																				//반지름 저장할 변수
		
		System.out.print("원의 반지름을 입력하세요 : ");											//반지름 입력 시작
		r = scan.nextInt();
		c.setRadius(r);																		//반지름 설정
		
		System.out.println("원의 둘레 : " + c.getRound() + "\t원의 넓이 : " + c.getArea());		//출력
	}
}
