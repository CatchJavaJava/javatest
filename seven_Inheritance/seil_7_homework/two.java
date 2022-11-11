package soomatter;

public class two {
    public static void main(String[] args) {
        car c = new car("파랑", 200, 1000, 5);
        c.show();

        System.out.println();
        vehicle v = c;
        v.show();
    }


}
