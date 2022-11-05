package second;
//main() 메소드에서 3개의 정수를 입력받고 average()에서 평균을 리턴하는 메소드 작성
import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		
		secondMethod Calculator = new secondMethod();
		
		System.out.print("정수 3개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double result = Calculator.average(a, b, c);
		
		System.out.println("평균 : " + result);
	}

}
