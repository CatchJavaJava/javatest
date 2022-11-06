import java.util.*; 
 
public abstract class Apple { 
	 
	Random ran = new Random();                  // 난수 생성 클래스 
	int money = ran.nextInt(11) + 20;           // 수리비는 20~30만원 사이 난수 
	 
	public void fix() { 
		System.out.println("수리를 합니다."); 
	} 
} 

class Frisbee extends Apple{
	public void fix() {
		System.out.println("Frisbee에서 수리, 수리비용은 " + money + "원");
	}
	public void show() {
		System.out.println("Frisbee 수리 비용 : " + money);
	}
}

class Astore extends Apple{
	public void fix() {
		System.out.println("Astore에서 수리, 수리비용은 " + money + "원");
	}
	public void show() {
		System.out.println("Astore 수리 비용 : " + money);
	}
}