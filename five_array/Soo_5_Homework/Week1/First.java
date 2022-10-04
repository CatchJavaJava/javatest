package Week1;
import java.util.Scanner;
public class Avg {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg;																// sum과 avg 선언
		
		int[] score = new int[10];												// 10개의 배열 생성
		try (Scanner sc = new Scanner(System.in)) {
			for(int i = 0;i<10;i++) {
				score[i] = sc.nextInt();
				sum = sum + score[i];
			}																	// 입력받은 각 숫자를 합함
		}
		
		avg = (double) sum / 10;												// 총합을 10으로 나누어 평균을 받음
		
		System.out.println("총점은 : " + sum + "점, 평균은 : " + avg + "점");	 // 총점과 평균을 보여줌
	}

}
