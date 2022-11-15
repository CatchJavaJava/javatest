package Jung_8_Homework.First;

public class Adder implements AddInterface {
    @Override
    public int add(int x,int y) {
        return x+y;
    }

    @Override
    public int add(int x) {
        int sum = 0;
        while(true) {
            sum += x;
            x = x -1;
            if(x == 0) {
                break;
            }
        }

        return sum;
    }
}