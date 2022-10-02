package Week1;
import java.util.Scanner;
public class Challenge {

	public static void main(String[] args) {

        int[] num = new int[100];                                       // 100개의 배열 생성

        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0;i < 100;i++) {
                num[i] = sc.nextInt(); 
                if(num[i] == 0) {                                       // 0 입력시 종료
                    break;
                }
                else if(num[i] % 2 == 0) {                              // 짝수일 시 2로 나누어 몫을 받음
                   num[i] = num[i] / 2;
                }
                else {                                                  // 나머지 경우, 즉 홀수이니 2를 곱함
                    num[i] = num[i] * 2;
                }
                System.out.println("num[" + i + "] = " + num[i]);       // num[i]의 경우를 출력해줌
            }
        }
        
    }
}