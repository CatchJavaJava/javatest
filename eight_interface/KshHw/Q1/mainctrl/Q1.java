package mainctrl;

import adder.*;

public class Q1 {
	public static void main(String[] args) {
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}
}
