package mainctrl;

import cellphone.*;

public class Q2 {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
	}
}
