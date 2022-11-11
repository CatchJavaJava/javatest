package Answer.Problem_2;

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("검정", 200, 1500, 6);
		c.show();
		
		System.out.println("-------------");
		
		Vehicle v = c;
		v.show();
	}

}