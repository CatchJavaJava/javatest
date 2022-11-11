package mymatter;
import java.util.Scanner;



public class three {

    public static int bigcheck(int n1, int n2) {

        if (n1 > n2) return n1;

        else return n2;



    }


    public static void main(String[] args) {

        int num1, num2;
        int big;

        System.out.println("두 정수 입력 : ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        big = bigcheck(num1, num2);
        System.out.printf("큰 수 : %d",big );

    }
}
