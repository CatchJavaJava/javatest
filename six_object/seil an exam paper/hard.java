package mymatter;
import java.util.Scanner;

public class hard {


    public static float nul(float num1) {

        return (float) (num1 * num1 * 3.14);
    }



    public static float durle(float num) {

        return (float) (num * 3.14 * 2);


    }



    public static void main(String[] args) {

        float r, du, nu;

        System.out.println("반지름 입력 : ");
        Scanner scan = new Scanner(System.in);
        r = scan.nextFloat();
        du = durle(r);
        nu = nul(r);
        System.out.printf("둘레는 %f",du );
        System.out.printf("넓이는 %f", nu);




    }
}
