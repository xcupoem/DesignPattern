package org.xcupoem.dp.factory.generalfactory;

public class Car implements Moveable {
	private static Car car = new Car();
	//private static List<Car> cars = new ArrayList<Car>();
	
	
	public Car() {
		
	}

	public static Car getInstance() {
		return car;
	}
	
	public void run() {
		System.out.println("开着汽车……");
	}
}
