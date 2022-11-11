package Answer.Challenge;
import java.util.*;

public abstract class Apple {
	
	Random ran = new Random();
	int money = ran.nextInt(11) + 20;
	
	public void fix() {
		System.out.println("수리를 합니다.");
	}
	

}