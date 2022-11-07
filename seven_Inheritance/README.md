# 7단원 상속
11/4일 자바 스터디 7단원 복습 문제입니다. **(발표자 : 임광수)**

## 문제리스트

* **연습 문제**
   
    1. Drink라는 추상클래스에서 alc() 도수를 출력하는 메소드를 선언한다. Beer, Soju, Wine은 Drink를 상속하고 각각의 도수는 다르다. Main클래스에서는 Beer, Soju, Wine의 도수를 출력한다.
    2. 카톡방에 사진 올렸어용
    3. 얘도 올렸어여 

* **도전 문제**
   
    1. Apple이라는 클래스는 Frisbee와 Astore의 부모클래스이다. Apple이라는 클래스는 아래와 같다.

import java.util.*;

public abstract class Apple {
	
	Random ran = new Random();                  // 난수 생성 클래스
	int money = ran.nextInt(11) + 20;           // 수리비는 20~30만원 사이 난수
	
	public void fix() {
		System.out.println("수리를 합니다.");
	}
	

}

Frisbee와 Astore 클래스는 각각 fix라는 함수를 오버라이딩하여 해당 지점에서 수리하는 문자열을 출력한다.
Iphone이라는 클래스에서는 핸드폰을 3번 떨어뜨리면 액정이 깨진다는 문자열과 함께 Frisbee와 Astore에서 수리비를 각각 비교하여 더 싼 쪽에서 수리를 하고 '~에서 수리, 수리비용은 ~원'을 출력하며 실행을 마친다.

도전문제 너무 개떡같이 만들어서 안 풀어도 돼요 ㅎㅎ...
