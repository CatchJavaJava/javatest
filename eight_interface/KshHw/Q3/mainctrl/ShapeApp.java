package mainctrl;

import circle.*;
import shape.*;

public class ShapeApp {
	public static void main(String[] args){
        Shape coin = new Circle(10);
        coin.redraw();
        System.out.println("코인의 면적은 " + coin.getArea());
    }
}
