package Week1;
import java.util.Scanner;
public class Num {
	public static void main(String[] args) {
		
		int[] num = new int[5];										// 5개의 배열 생성
		
		try (Scanner sc = new Scanner(System.in)) {
			for(int i = 0;i<5;i++) {
				num[i] = sc.nextInt();
			}														// num[0]~num[4] 숫자 선언
		}
		
		for(int i = 0;i<5;i++) {
			System.out.print("num[" + i + "] = " + num[i] + ". ");
		}															// num[0]~num[4] 값 순서대로 출력
	}
}
