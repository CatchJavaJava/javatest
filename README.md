# 자바스터디 연습문제
발표한 주제를 바탕으로 문제들을 모아놓는 공간입니다. <br>
한 단원 당 연습문제 3개, 도전과제 1개 <br>

## 5단원 배열 - 이정우
* **연습 문제**
   
    1. 10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성

    2. 5개 정수를 입력받은 후 차례로 출력하는 프로그램

    3. 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램

* **도전 문제**
   
    1. 100개 이하의 정수를 입력받다가 0이 입력되면 0을 제외하고 그때까지 입력받은 개수를 출력한 후 입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을 짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램 

<br>

## 6단원 객체지향 - 김세일
* **연습 문제**

   1. 문자열의 소문자를 대문자로 바꿔주는 메소드 작성
   
   2. main() 메소드에서 3개의 정수를 입력받고 avreage() 에서 평균을 리턴(호출)하는 메소드 작성
   
   3. main() 메소드에서 2개의 정수를 입력받고 bigcheck() 에서 큰수를 리턴(호출)하는 메소드 작성

* **도전 문제**
  
   1. main() 메소드에서 반지름을 입력받아 메소드 두개를 생성하여 원의 둘레와 넓이를 리턴하여 출력해주는 메소드 작성 (둘레 = 2 * 3.14 * 반지름, 넓이 = 3.14 * 반지름^2)

<br>

## 7단원 상속 - 임광수
* **연습 문제**
   
    1. Drink라는 추상클래스에서 alc() 도수를 출력하는 메소드를 선언한다. Beer, Soju, Wine은 Drink를 상속하고 각각의 도수는 다르다. Main클래스에서는 Beer, Soju, Wine의 도수를 출력한다.
    2. 오버라이딩 메소드, 다형성의 관계 살펴보기
    3. 부모 클래스를 통해 자식 클래스 생성 후 관련 프로그램 

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
<br>

## 8단원 인터페이스 - 이슬인
* **연습 문제**

    1. 인터페이스 AdderInterface의 코드는 다음과 같다.
    ```java
        interface AdderInterface{
            int add(int x, int y); // x와 y의 합 리턴
            int add(int n);        // 1에서 n까지의 정수 합 리턴. n은 0보다 큰 수로 가정
        }
       AdderInterface를 상속받은 클래스 MyAdder를 작성하여, 다음 main()을 실행할 때
       아래 실행 결과와 같이 출력되도록 하라. 
       public static void main(String[] args){
            MyAdder adder = new MyAdder();
            System.out.println(adder.add(5,10));
            System.out.println(adder.add(10));
       }
    ```
       출력 결과 : 15
                 55

    2. PhoneInterface 인터페이스를 구현하고 flash() 메소드를 추가한 SamsungPhone 클래스 작성하기
    ```java
        interface PhoneInterface {      // 인터페이스 선언
            final int TIMEOUT = 10000;  // 상수 필드 선언
            void sendCall();            // 추상 메소드
            void receiveCall();         // 추상 메소드
            default void printLogo(){   // default 메소드
                System.out.println("** Phone **");
            }
        }
    ``` 
    SamsungPhonoe은 PhoneInterface를 상속받았다. 
    여기서 PhoneInterface의 모든 추상 메소드를 구현한다.

    main문
    ```java
        public class InterfaceEx{
            public static void main(String[] args) {
                SamsungPhonoe phone = new SamsungPhone();
                phone.printLogo();
                phone.sendCall();
                phone.receiveCall();
                phone.flash();
            }
        }
    ``` 

    실행 결과
    ** Phone **
    띠리리리링
    전화가 왔습니다.
    전화기에 불이 켜졌습니다.

* **도전 문제**

    1. 다음은 도형을 묘사하는 인터페이스 Shape이다.
    ```java
        interface Shape{
            final double PI = 3.14;
            void draw();
            double getArea();
            default public void redraw(){
                System.out.println("--- 다시 그립니다. ---");
                draw();
            }
        }
    ```

    다음 main() 메소드와 실행 결과를 참고하여, 인터페이스 Shape을 구현한 클래스 Circle를 작성하고 전체 프로그램을 완성하라.
    ```java
        public class ShapeApp{
            public static void main(String[] args){
                Shape coin = new Circle(10);
                coin.redraw();
                System.out.println("코인의 면적은 " + coin.getArea());
            }
        }
    ```

    실행 결과
    --- 다시 그립니다. ---
    반지름 10 코인의 면적은 314.0

<br/>

## 10 & 11 단원 예외처리 & 기본API 클래스 - 김수현
* **연습 문제**
   
    1. String 클래스의 메소드를 이용하여 아래와 같이 정의된 words String 배열 속에서 입력된 단어로 시작되는 단어를 모두 찾아 차례대로 출력하시오. 자바 기본 라이브러리에 대한 내용은 [여기](https://docs.oracle.com/en/java/javase/17/docs/api/index.html)에서 참조 가능.
    ```java
        String[] words = {"apple", "sigma", "java", "node", "beta", "apple pie", "java.lang.Math"};

    ```
    2. 문자열 "10248"를 Integer형으로 변환하여 자료형과 값을 출력하시오.<br/>
    출력 결과<br/>
        자료형: java.lang.Integer<br/>
        값: 10248

    3. String 클래스의 charAt() 메소드를 활용하여 대소문자 상관없이 알파벳을 나열한 문장을 입력하면 알파벳 순서에 따라서 0부터 25까지의 숫자가 출력되는 프로그램을 만드시오. 아래는 프로그램의 예시이다. <br/>
    출력 예시<br/>
        입력: "BaCdefc"<br/>
        출력: 1023452


* **도전 문제**
   
    1. 은행과 계좌, 그리고 계좌생성, 계좌목록조회, 예금, 출금기능 구현한 코드를 아래의 조건에 맞게 수정 및 완성하시오. 코드는 Q4_code 폴더에 존재한다.
        * 모든 예외는 예외처리가 되어야 한다.
        * 서로 다른 계좌주의 계좌끼리는 같은 계좌번호를 가질 수 없다.
        * 출금 과정 중 잔액이 마이너스가 될 수 없다.

<br/>

## 13 & 14 단원 컬렉션 프레임워크 & 입출력 스트림 - 김수현
* **연습 문제**
   
    1. [Random 클래스](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html#nextInt(int))를 활용하여 0부터 10까지의 랜덤한 숫자 10개를 출력하고 랜덤으로 뽑힌 숫자를 중복없이 출력하시오.<br/>
    출력 예시<br/>
        랜덤한 숫자 : 1 0 4 2 2 9 1 8 10 2<br/>
        중복을 제외합니다.<br/>
        1 0 4 2 9 8 10
    2. 주어진 사진을 Temp 폴더에 1024 byte 단위로 복사하시오. 사진은 Q2 폴더에 존재한다.


* **도전 문제**
   
    1. 아래는 System.in에 대한 예시코드이다. [Scanner 클래스](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html)를 사용하는 코드로 수정하시오.
    ```java
    import java.io.*;

    public class GetLineStringFromKeyboard {
	    public static void main(String[] args) throws Exception {
		    InputStream is = System.in;
		    Reader reader = new InputStreamReader(is);
		    BufferedReader br = new BufferedReader(reader);

		    while(true) {
			    System.out.print("입력하세요: ");
			    String lineStr = br.readLine();
			    if(lineStr.equals("q") || lineStr.equals("quit")) break;
			    System.out.print("입력된내용: " + lineStr);
			    System.out.println();
		    }   
		
		    br.close();
	    }
    }
    ``` 