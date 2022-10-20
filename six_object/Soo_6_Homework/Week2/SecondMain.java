package Soo_6_Homework.Week2;
import java.util.Scanner;
public class SecondMain {
    public static void main(String[] args) {
       
        Second Average = new Second();                                  //Second 클래스 안에 있는 메소드 사용
        try (Scanner sc = new Scanner(System.in)) {
            double a= sc.nextDouble();
            double b= sc.nextDouble();
            double c= sc.nextDouble();
            double avg = Average.average(a, b, c);                      //Second에 있는 average라는 메소드로 이동
            System.out.printf("세 값의 평균은 : %.1f\n", avg);   
        }
    }
    
}
