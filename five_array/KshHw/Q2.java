import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);              //스캐너 생성
        int[] arr = new int[5];

        for(int i=0; i<5; i++)                              //배열에 정수 입력 시작
        {
            System.out.print("정수를 입력하세요 : ");
            arr[i] = scan.nextInt();
        }

        scan.close();                                       //스캐너 종료

        for(int i : arr)                                    //배열 출력 시작
            System.out.println(i);
    }
}