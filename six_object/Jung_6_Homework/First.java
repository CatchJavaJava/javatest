import java.util.*;

public class First {
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args)	
	{
		String str;					
		
		System.out.print("문자열 입력 : ");	
		str = sc.next();
		
		str = str.toUpperCase();		
		System.out.println("대문자 변환 : " , str);		
    }
}
