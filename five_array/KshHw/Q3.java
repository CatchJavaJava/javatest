import java.util.Scanner;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);                  //스캐너 생성
        int[] arr = new int[10];

        for(int i=0; i<10; i++)                                 //배열 데이터 입력
        {
            System.out.print("정수를 입력하세요 : ");
            arr[i] = scan.nextInt();
        }

        scan.close();                                           //스캐너 종료

        Arrays.sort(arr);                                       //Arrays 라이브러리의 정렬 함수 사용, 배열의 데이터를 오름차순으로 정렬

        System.out.println("최대값 : " + arr[arr.length-1]);    //정렬된 배열의 마지막 데이터(최대값)를 출력
    }
}
