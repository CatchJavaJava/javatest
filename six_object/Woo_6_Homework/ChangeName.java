//연습문제
package six_object.Woo_6_Homework;

import java.util.Scanner;

class Change{
    double changeNumber(double a){
        double inch;
        inch = a * 2.54;
        return inch;
    }
}

public class ChangeName {
    public static void main(String[] args) {
        Change ch = new Change();
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        double number = sc.nextDouble();
        double answer = ch.changeNumber(number);
        System.out.println("입력한"+number+"인치는 약 "+answer+"입니다");
    }
}
