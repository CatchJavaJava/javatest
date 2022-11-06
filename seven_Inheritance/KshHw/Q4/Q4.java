
public class Q4 {
	public static void main(String[] args) {
		Frisbee f1 = new Frisbee();
		Astore a1 = new Astore();
		Iphone i1= new Iphone();
		
		f1.show();
		a1.show();
		
		for(int i=0; i<9; i++)							//몇 번을 반복해도 결과가 같음. Frisbee와 Astore의 슈퍼 클래스인 Apple의 필드에 선언된 랜덤 클래스를 이용하여 수리비용을 결정하기 때문
			i1.breakGlass(f1, a1);						//자식클래스로 인스턴스를 생성하면 부모클래스의 기본 생성자가 호출되고 그 다음에 자식 클래스의 생성자를 호출-> 먼저 Apple이 생성되고 필드에서 난수 설정-> 해당되는 자식클래스로
	}
}
