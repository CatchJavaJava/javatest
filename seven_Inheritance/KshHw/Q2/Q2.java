
public class Q2 {
	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c;				//업캐스팅: 자식 클래스를 부모 클래스로 형변환
		v.show();					//부모 클래스에서 자식 클래스의 메소드 사용
		
		
		/* 클래스 확인용
		System.out.println(v.getClass());
		System.out.println(c.getClass());
		*/
	}
}
