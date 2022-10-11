package Soo_6_Homework.Week2;
import java.util.Scanner;
public class FirstMain {
    public static void main(String[] args) {
        First Change = new First();                     //First 클래스 안에 있는 메소드 사용

        try (Scanner sc = new Scanner(System.in)) {
            String Text = sc.nextLine();                //Text라는 문자열 변수 생성 후 입력하는 명령어 생성
            Change.change(Text);                        //First에 있는 change라는 메소드로 이동
        }
   }
}
