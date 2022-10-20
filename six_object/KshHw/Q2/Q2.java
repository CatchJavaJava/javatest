import java.util.Scanner;


public class Q2 {
	private static Average aver = new Average();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int a, b, c;													//정수 전달을 위한 변수
		
		System.out.print("첫 번째 정수를 입력하세요 : ");						//정수 입력 시작
		a = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		b = scan.nextInt();
		System.out.print("세 번째 정수를 입력하세요 : ");
		c = scan.nextInt();
		
		System.out.println("세 정수의 평균 : " + aver.average(a, b, c));	//변환+출력
	}
}
