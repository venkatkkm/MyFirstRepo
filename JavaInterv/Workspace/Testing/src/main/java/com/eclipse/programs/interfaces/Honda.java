package com.eclipse.programs.interfaces;

public class Honda implements Car{
	
	@Override
	public String brand() {
		System.out.println("honda brand");
		return "honda";
	}
	@Override
	public int speed() {
		System.out.println("speed is : 120kmph");
		return 120;
	}
	public static void main(String[] args) {
		Honda h = new Honda();
		h.brand();
		Car c = new Honda();
		c.hi();
		h.hi();
		Car.car1();
		//Car c = new Car();--can not instantiate interfaces
		System.out.println("car brand "+h.brand());
		System.out.println("car speed "+h.speed());
		h.speed();
	}

}
