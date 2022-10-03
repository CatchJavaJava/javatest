package third;
//10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		int[] num = new int[10];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 10개를 입력하세요 : ");
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < num.length ; i++) {
			if(max < num[i])
				max = num[i];
		}
		
		System.out.println("가장 큰 수 : " + max);

	}

}
