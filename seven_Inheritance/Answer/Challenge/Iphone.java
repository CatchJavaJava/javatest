package Answer.Challenge;
import java.util.*;

public class Iphone {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Frisbee Frisbee = new Frisbee();
		Astore Astore = new Astore();
		
		int costInFrisbee = Frisbee.money;
		int costInAstore = Astore.money;
		int accumulatedDamage = 0;
		
		while(true) {
			int fall = ran.nextInt(2);					// 0은 떨어짐, 1은 떨어지지 않음
			switch(fall) {
			case 0:
				accumulatedDamage++;
				System.out.println("핸드폰 떨어뜨림 ㅠㅠ, 떨어뜨린 횟수 : " + accumulatedDamage);
				break;
			case 1:
				System.out.println("핸드폰 잡았음!!");
				break;
			}
			if(accumulatedDamage == 3) {
				System.out.println();
				System.out.println("[액정 깨짐]");
				System.out.println("하... ㅅㅂ...");
				if(costInFrisbee > costInAstore) {
					System.out.println("Astore에서 수리해야겠다. 수리 비용은 " + costInFrisbee + "만원?!");
				} else {
					System.out.println("Frisbee에서 수리해야겠다. 수리 비용은 " + costInAstore + "만원?!");
				}
				System.out.println("수리비 ㅅㅂ...");
				accumulatedDamage = 0;
				break;
			}	
		}
	}
}