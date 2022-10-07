package sec01.exam01;

import java.util.Scanner;
import java.util.Arrays;


public class three {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int intArray[] = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++) {
            intArray[i] = in.nextInt();
            if (intArray[i] > max)
                max = intArray[i];
        }
        System.out.print("입력된 수에서 가장 큰 수는 " + max + "입니다.");
    }
}
