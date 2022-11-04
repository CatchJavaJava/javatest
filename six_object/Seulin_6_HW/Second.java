package six_object.Seulin_6_HW;
// main() 메소드에서 3개의 정수를 입력받고 avreage() 에서 평균을 리턴(호출)하는 메소드 작성
import java.util.Scanner;
class average {
	double avg(int a, int b, int c){
		int sum;
		double avg;
		sum = a + b + c;
		avg = sum / 3;
		return avg;
	}
}

public class Second {
	
	public static void main(String[] args) {
		double avg1;
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		average a1 = new average();
		avg1 = a1.avg(a, b, c);
		System.out.println(avg1);
		
		sc.close();
	}
}

