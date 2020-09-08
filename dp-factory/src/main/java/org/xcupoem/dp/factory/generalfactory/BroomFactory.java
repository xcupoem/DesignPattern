package org.xcupoem.dp.factory.generalfactory;


public class BroomFactory extends VehicleFactory {

	@Override
	public Moveable create() {
		return new Broom();
	}

}
