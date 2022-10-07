package sec01.exam01;

import java.util.Scanner;

public class two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Array[] = new int[5];
        System.out.println("정수를 입력하세요 : ");

        for (int i = 0; i < 5; i++) {

            Array[i] = scan.nextInt();
            System.out.println(Array[i]);
        }

    }
}







