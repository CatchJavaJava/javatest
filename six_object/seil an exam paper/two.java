package mymatter;
import java.util.Scanner;

public class two {

    public static float average(int n1,int n2,int n3) {

        return ((n1 + n2 + n3) / 3);

    }



    public static void main(String[] args) {

    int num1, num2, num3;
    float avg;

        System.out.println("세개의 정수 입력 : ");

    Scanner scan = new Scanner(System.in);
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();

    avg = average(num1, num2, num3);
        System.out.printf("세 정수의 평균 : %f", avg);



    }

}
