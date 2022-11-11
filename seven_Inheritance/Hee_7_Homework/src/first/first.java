package first;
//Drink라는 추상클래스를 이용하여 맥주, 소주, 와인의 도수를 출력하는 프로그램
public class first {

	public static void main(String[] args) {
		method(new Beer());
		method(new Soju());
		method(new Wine());
	}
	
	public static void method(Drink content) {
		content.alc();
	}
}
