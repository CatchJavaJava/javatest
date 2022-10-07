import java.util.Scanner;


public class Q4 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);                  //스캐너 생성
        int[] arr = new int[100];                               //100개 이하의 정수를 받을 수 있는 배열
        int data = 0;                                           //입력이 저장되어 입력된 수를 판별하기위한 변수
        int index = 0;                                          //몇 개의 입력을 받았는지 저장하는 변수

        for(int i=0; i<100; i++)                                //입력 시작
        {
            System.out.print("정수를 입력하세요 : ");
            data = scan.nextInt();                              //정수 입력

            if(data==0)                                         //0을 입력받을 시 입력종료
                break;

            else if(data%2==0)                                  //짝수의 경우
                arr[i] = data/2;

            else                                                //홀수의 경우
                arr[i] = data*2;
            
            index++;                                            //하나의 입력이 끝났음
        }

        scan.close();                                           //스캐너 종료

        for(int i=0; i<index; i++)                              //배열의 길이만큼 출력시 입력이 일어나지 않은 부분에 대한 0출력을 막기위해 index로 범위 지정
            System.out.println(arr[i]);
    }
}
