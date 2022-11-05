// main() 메소드에서 2개의 정수를 입력받고 bigcheck() 에서 큰수를 리턴(호출)하는 메소드 작성
import java.util.Scanner;
class bigcheck{
	int bigcheck(int a, int b){
		if (a>b) 
			return a;
		else
			return b;
	}
}

public class Third {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		bigcheck bc = new bigcheck();
		c = bc.bigcheck(a, b);
		System.out.println(c);
	}

}
