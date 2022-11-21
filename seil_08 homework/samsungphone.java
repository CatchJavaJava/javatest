package seulinmatter;

public class samsungphone implements phoneinterface {

    @Override
    public void sendcall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receivecall() {
        System.out.println("전화가 왔습니다");
    }

    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다");
    }
}
