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
