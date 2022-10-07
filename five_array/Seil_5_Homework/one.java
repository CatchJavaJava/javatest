package sec01.exam01;

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Array[] = new int[10];
        int sum = 0, count = 0;

        for (int i = 0; i < 10; i++) {

            Array[i] = in.nextInt();
            sum = sum + Array[i];
            count++;
        }

        System.out.println("총점" + sum);
        System.out.println("평균" + sum / count);

    }
}