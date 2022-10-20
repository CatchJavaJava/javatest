package Soo_6_Homework.Week2;
import java.util.Scanner;
public class ThirdMain {
    public  static void main(String[] args) {
        Third Big = new Third();                             //Third 클래스 안에 있는 메소드 사용
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            int big = Big.big(a, b);                         //Third에 있는 big이라는 메소드로 이동
            System.out.println("둘 중 큰 수는 : " + big);
        }

    }
    
}
