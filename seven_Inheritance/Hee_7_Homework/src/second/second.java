package second;
//상속을 이용하여 오버라이딩 메서드와 다형성 관계를 확인하는 프로그램
public class second {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();
	}
}
