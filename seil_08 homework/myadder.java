package seulinmatter;

public class myadder implements adderinterface {
    @Override
    public int add(int x, int y) {
        return x+y;
    }


    @Override
    public int add(int n) {
        int sum = 0;
        while(true) {
            sum = sum + n;
            n = n-1;
            if(n==0) {
                break;
            }
        }
        return sum;
    }
}
