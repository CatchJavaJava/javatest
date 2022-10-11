package Soo_6_Homework.Week2;
import java.util.Scanner;
public class ChallengeMain {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Challenge Cal = new Challenge();                        //Challenge 클래스 안에 있는 메소드 사용
            double rad = sc.nextDouble();
            double result1 = Cal.Round(rad);                        //Challenge에 있는 Round라는 메소드로 이동
            double result2 = Cal.Area(rad);                         //Challenge에 있는 Area라는 메소드로 이동
            System.out.printf("원의 둘레는 : %.1f, 원의 넓이는 : %.1f\n", result1, result2);
        }

    }
    
}
