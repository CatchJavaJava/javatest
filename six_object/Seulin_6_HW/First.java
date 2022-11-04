// 문자열의 소문자를 대문자로 바꿔주는 메소드 작성
import java.util.Scanner;

public class First {
	First(String s){
		s = s.toUpperCase();
		System.out.println(s);
	}
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		s = sc.next();
		First f1 = new First(s);
		sc.close();
	
	}
}