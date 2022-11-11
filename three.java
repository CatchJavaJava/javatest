package soomatter;

public class three {
    public static void main(String[] args) {

        person[] pm = new person[3];
        pm[0] = new person("질동이", 22);
        pm[1] = new student("황진이", 23, 100);
        pm[2] = new foreignstudent("amy", 30, 200, "U.S.A");

        for (person i : pm)
            i.show();
    }
}
