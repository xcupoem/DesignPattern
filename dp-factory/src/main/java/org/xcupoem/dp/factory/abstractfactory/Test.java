package org.xcupoem.dp.factory.abstractfactory;

public class Test {

	public static void main(String[] args) {
		AbstractFactory f = new MagicFactory();
		Vehicle v = f.createVehicle();
		v.run();
		 
		Weapon w = f.createWeapon();
		w.shoot();
		Food a = f.createFood();
		a.printName();
		
		
	}

}
