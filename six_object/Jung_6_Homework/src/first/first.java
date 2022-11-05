package first;
//문자열의 소문자를 대문자로 바꿔주는 메소드 작성
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
		firstMethod upperString = new firstMethod();
		
		System.out.print("문자열을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		upperString.upper(s);

	}

}
