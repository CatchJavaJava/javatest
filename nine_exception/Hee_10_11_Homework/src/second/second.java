package second;
//문자열 "10248"를 Integer형으로 변환하여 자료형과 값을 출력하는 프로그램
public class second {

	public static void main(String[] args) {
		 
		String s = "10248";
		int a = Integer.parseInt(s);
		
		Integer b = Integer.valueOf(a);
	    System.out.println("자료형 : " + b.getClass().getName());
	    System.out.println("값 : "+ b);

	}

}
