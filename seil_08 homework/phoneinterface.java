package seulinmatter;

public interface phoneinterface {

    final int timeout = 10000;
    void sendcall();
    void receivecall();
    default void printlogo() {
        System.out.println("** phone **");
    }
}
