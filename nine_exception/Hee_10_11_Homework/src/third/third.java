package third;
//String 클래스의 charAt() 메소드를 활용하여 대소문자 상관없이 알파벳을 나열한 문장을 입력하면 알파벳 순서에 따라서 0부터 25까지의 숫자가 출력되는 프로그램
import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String a = sc.next();
		String b = a.toLowerCase();
		
		System.out.print("출력 : ");
		for(int i = 0 ; i < a.length() ; i++) {
			System.out.print((int)b.charAt(i)-97); //아스키코드 a=97
		}
		
	}
}
