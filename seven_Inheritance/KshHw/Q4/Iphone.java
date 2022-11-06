public class Iphone {
	private int breakCount;
	
	public Iphone() {
		this.breakCount = 3;									//아이폰을 몇 번 떨어트렸는지 체크하는 변수
	}
	
	public void breakGlass(Frisbee frisbee, Astore astore)		//아이폰을 떨어트리는 메소드, 3번 떨어트렸을 때 Iphone의 수리하는 메소드 fix()를 소환
	{
		breakCount--;
		System.out.println("아이폰을 떨어트렸습니다!");
		
		if(breakCount == 0) {
			fix(frisbee, astore);
			breakCount = 3;
		}
		
		System.out.println("아이폰을 3번 떨어트리면 액정이 깨집니다.");
		System.out.println("현재 남은 횟수 : " + breakCount);
	}
	
	public void fix(Frisbee frisbee, Astore astore)				//두 가게의 수리비용을 비교하여 더 싼 가게에서 수리하는 함수
	{
		if(frisbee.money>astore.money) {
			astore.fix();
			return;
		}
		
		frisbee.fix();
	}
}
