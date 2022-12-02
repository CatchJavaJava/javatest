import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("입력 : ");
        String a = scan.next().toLowerCase();
        int n = 0;
        
        for(int i = 0; i<a.length(); i++)
            n+=(a.charAt(i)-'a')*Math.pow(10, a.length()-i-1);
        
        System.out.println("출력  : " + n);

        scan.close();
    }    
}
