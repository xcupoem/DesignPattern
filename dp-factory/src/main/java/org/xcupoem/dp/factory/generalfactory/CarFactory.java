package org.xcupoem.dp.factory.generalfactory;

public class CarFactory extends VehicleFactory {
	public Moveable create() {
		return new Car();
	}
}
