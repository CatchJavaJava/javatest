import java.util.Scanner;

public class Q1{
    public static void main(String[] args)                  //메인함수
    {
        int[] score = getScore(10);                      //getScore 함수에서 데이터를 입력받은 배열 s을 리턴
        int scoreSum = getSum(score);                       //getSum 함수에서 총합(sum)을 구해 리턴
        double scoreAverage = scoreSum/(score.length);      //배열의 멤버인 length(길이)를 이용하여 평균구하기

        System.out.println("점수의 총합 : " + scoreSum);
        System.out.println("점수의 평균 : " + scoreAverage);

    }


    public static int[] getScore(int n)                     //n 길이의 정수 배열 데이터를 입력받는 함수
    {
        Scanner scan = new Scanner(System.in);              //스캐너 생성
        int[] s = new int[n];                               //배열 생성

        for(int i=0; i<n; i++)
        {
            System.out.print("점수를 입력하세요 : ");
            s[i] = scan.nextInt();                          //정수 입력
        }
        
        scan.close();                                       //스캐너 종료
        return s;                                           //배열을 리턴
    }


    public static int getSum(int[] s)                       //총합을 구하는 함수
    {
        int sum = 0;

        for(int i : s)                                      //i에 차례대로 배열 s의 값을 대입
        {
            sum+=i;
        }

        return sum;
    }
}
