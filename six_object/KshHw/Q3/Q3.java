import java.util.Scanner;


public class Q3 {
	private static BigCheck bc = new BigCheck();
	private static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		int a, b;														//정수 전달을 위한 변수
		
		System.out.print("첫 번째 정수를 입력하세요 : ");						//정수 입력 시작
		a = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		b = scan.nextInt();
		
		System.out.println("더 큰 정수 : " + bc.bigCheck(a, b));			//출력
	}

}
