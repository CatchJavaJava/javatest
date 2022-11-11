package soomatter;

import java.sql.SQLOutput;

public abstract class drink {

    int alcol;

    public drink(int alcol) {
        this.alcol = alcol;
    }

    public abstract void alc();

}

class beer extends drink{
    String name;

    public beer(int alcol,String name) {
        super(alcol);
        this.name = name;
    }

    public void alc() {
        System.out.println(name +" 맥주의 도수 : "+ alcol + "도");
    }
}

class soju extends drink{
    String name;

    public soju(int alcol, String name) {
        super(alcol);
        this.name = name;
        }

        public void alc() {
            System.out.println(name +" 소주의 도수 : "+ alcol + "도");
        }
}

class wine extends drink{
    String name;

    public wine(int alcol, String name) {
        super(alcol);
        this.name = name;
    }

    public void alc() {
        System.out.println(name +" 와인의 도수 : "+ alcol + "도");
    }

}
