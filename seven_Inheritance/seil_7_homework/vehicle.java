package soomatter;

import org.w3c.dom.ls.LSOutput;

public class vehicle {
    String color;
    int speed;

    public vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void show() {
        System.out.println("색 : " + color + "속도 : " + speed);
    }
}

    class car extends vehicle {
        int displacement;
        int gears;

        public car(String color, int speed, int displacement, int gears) {
            super(color, speed);
            this.displacement = displacement;
            this.gears = gears;
        }

        @Override
        public void show() {

            System.out.println("색 :" + color + "속도 : " + speed + "배기량 : " + displacement + "기어 단수 : " + gears);
        }
    }

