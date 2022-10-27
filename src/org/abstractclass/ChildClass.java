package org.abstractclass;

public class ChildClass extends ParentClass {//it is compulsory implement un-implement method
	
	public void iphoneCharger() {
		System.out.println("Charger price is:2500 with GST");
	}
	public void iphoneAirBuds() {
		System.out.println("AirBuds price is:5677 with GST");
	}
	@Override
	
	public void appleIphone(int a, String b) {
		System.out.println("IPhoneX price is 50999 with GST");
		System.out.println("interger:"+a+"String:"+b);
		/*
		 * appleIphone method is abstract method of parent class it override child class
		 */
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.appleIphone(10, "senthil");
		c.iphoneAirBuds();
		c.iphoneCharger();
		c.oneplusmobile();
		c.phone();
			
		
	}

}
