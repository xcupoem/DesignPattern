package org.xcupoem.dp.factory.generalfactory;

public class PlaneFactory extends VehicleFactory {
	public Moveable create() {
		return new Plane();
	}
}
