# 자바스터디 연습문제
발표한 주제를 바탕으로 문제들을 모아놓는 공간입니다. <br>
한 단원 당 연습문제 3개, 도전과제 1개

## 5단원 배열 - 이정우
* **연습 문제**
   
    1. 10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성

    2. 5개 정수를 입력받은 후 차례로 출력하는 프로그램

    3. 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램

* **도전 문제**
   
    1. 100개 이하의 정수를 입력받다가 0이 입력되면 0을 제외하고 그때까지 입력받은 개수를 출력한 후 입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을 짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램 

## 6단원 객체지향 - 김세일
* **연습 문제**

   1. 문자열의 소문자를 대문자로 바꿔주는 메소드 작성
   
   2. main() 메소드에서 3개의 정수를 입력받고 avreage() 에서 평균을 리턴(호출)하는 메소드 작성
   
   3. main() 메소드에서 2개의 정수를 입력받고 bigcheck() 에서 큰수를 리턴(호출)하는 메소드 작성

  * **도전 문제**
  
   1. main() 메소드에서 반지름을 입력받아 메소드 두개를 생성하여 원의 둘레와 넓이를 리턴하여 출력해주는 메소드 작성 (둘레 = 2 * 3.14 * 반지름, 넓이 = 3.14 * 반지름^2)

## 7단원 상속 - 임광수
* **연습 문제**
   
    1. Drink라는 추상클래스에서 alc() 도수를 출력하는 메소드를 선언한다. Beer, Soju, Wine은 Drink를 상속하고 각각의 도수는 다르다. Main클래스에서는 Beer, Soju, Wine의 도수를 출력한다.
    2. 카톡방에 사진 올렸어용
    3. 얘도 올렸어여 

* **도전 문제**
   
    1. Apple이라는 클래스는 Frisbee와 Astore의 부모클래스이다. Apple이라는 클래스는 아래와 같다
    ```java
    import java.util.*;

public abstract class Apple {
	
	Random ran = new Random();                  // 난수 생성 클래스
	int money = ran.nextInt(11) + 20;           // 수리비는 20~30만원 사이 난수
	
	public void fix() {
		System.out.println("수리를 합니다.");
	}
	

}
```
