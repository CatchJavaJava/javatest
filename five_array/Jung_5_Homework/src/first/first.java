package first;
//10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총합과 평균을 구하여 출력하는 프로그램
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		int total = 0;
		double average = 0.0;
		
		System.out.println("정수 10개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < num.length ; i++) {
			total += num[i];
		}
		
		average = (double) total / num.length;
		
		System.out.println("총합 : " + total + ", 평균 : " + average);
	}

}
