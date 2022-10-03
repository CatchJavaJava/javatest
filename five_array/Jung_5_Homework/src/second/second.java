package second;
//5개 정수를 입력받은 후 차례로 출력하는 프로그램
import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요 : ");
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println(num[i]);
		}
	}
}
