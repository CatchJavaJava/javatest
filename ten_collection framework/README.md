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