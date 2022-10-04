package Week1;
import java.util.Scanner;
public class Third {
	public static void main(String[] args) {
		
		int a = 0;
		int big = 0;									// a와 b 선언
		
		int[] num = new int[10];						// 10개의 배열 생성
		try (Scanner sc = new Scanner(System.in)) {
			for(int i = 0;i<10;i++) {
				num[i] = sc.nextInt();					// num[0]~num[9] 숫자 선언
				if(i == 9) {
					break;
				}
				else if (num[i+1] > num[i]) {
					a = num[i+1];
				}
				else {
					a = num[i];
				}
				big = (big >= a) ? big : a;				// 자신과 바로 앞의 수를 비교하여 a에 저장 후 big 보다 크면 big에 a 저장, 그렇지 않다면 big 유지
				}										
		}
		System.out.println("가장 큰 수는 : " + big);	 // 최종결과 big을 보여줌
	}
	
}
