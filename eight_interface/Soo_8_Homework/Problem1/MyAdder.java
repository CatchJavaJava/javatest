package Soo_8_Homework.Problem1;

public class MyAdder implements AdderInterface {
    @Override
    public int add(int x,int y) {
        return x+y;
    }

    @Override
    public int add(int n) {
        int sum = 0;
        while(true) {
            sum += n;
            n = n -1;
            if(n == 0) {
                break;
            }
        }

        return sum;
    }
}