package third;
//main() 메소드에서 2개의 정수를 입력받고 bigcheck()에서 큰 수를 리턴하는 메소드 작성
import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		
		thirdMethod compare = new thirdMethod();
		
		System.out.print("정수 2개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = compare.bigcheck(a, b);
		
		System.out.println("둘 중 더 큰 수는 " + result + "입니다.");

	}

}
