package mymatter;
import java.util.Scanner;

public class one {

    public static void main(String[] args) {

        String str;

        System.out.println("문자열의 소문자 입력 : ");
    Scanner scan = new Scanner(System.in);
    str = scan.nextLine();

    str = str.toUpperCase();
        System.out.printf("대문자 : %s", str);

    }


}
