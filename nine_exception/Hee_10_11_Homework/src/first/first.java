package first;
//String 클래스의 메소드를 이용하여 words 속에서 입력된 단어로 시작되는 단어를 모두 찾아 차례대로 출력하는 프로그램
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
		String[] words = {"apple", "sigma", "java", "node", "beta", "apple pie", "java.lang.Math"};

		Scanner sc = new Scanner(System.in);
		System.out.print("단어의 첫글자를 입력하세요 : ");
		char a = sc.next().charAt(0);
		
		for ( int i = 0 ; i < words.length ; i++ ) {
			if (a == words[i].charAt(0)) {
				System.out.print(words[i]+" ");
			}
			
		}
		
	}

}
