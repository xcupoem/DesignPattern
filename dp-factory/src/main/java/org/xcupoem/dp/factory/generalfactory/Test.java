package org.xcupoem.dp.factory.generalfactory;

public class Test {

	public static void main(String[] args) {
		/*Car c = Car.getInstance();
		Car c2 = Car.getInstance();
		if(c == c2) {
			System.out.println("same car");
		}
		c.run();*/
		VehicleFactory factory = new BroomFactory();
		
		Moveable m = factory.create();
		m.run();
		 
		//new Broom().run();
		

	}

}
