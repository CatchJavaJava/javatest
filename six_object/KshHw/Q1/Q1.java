import java.util.Scanner;

public class Q1 {
	
	private static Upper up = new Upper();
	private static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args)										//메인
	{
		String str;																//가독성을 위한 변수 추가
		
		System.out.print("문자열을 입력하세요 : ");									//문자열 입력
		str = scan.next();
		
		up.setLower(str);														//up의 lower 필드에 str의 값을 대입
		System.out.println("소문자 대문자로 변환 완료 : " + up.changeToUpper());		//변환+출력
	}
}
