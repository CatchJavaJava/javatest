package soomatter;



public class one {

    public static void main(String[] args) {

        beer b = new beer(5,"테라");
        soju s = new soju(19, "후레쉬");
        wine w = new wine(14, "레드와인");

        b.alc();
        s.alc();
        w.alc();

    }
}
