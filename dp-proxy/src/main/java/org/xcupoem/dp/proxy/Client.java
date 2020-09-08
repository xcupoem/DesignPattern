package org.xcupoem.dp.proxy;

public class Client {
	public static void main(String[] args) {
		Tank t = new Tank();
		//日志包着时间
		TankLogProxy tlp = new TankLogProxy(t);
		
		//Moveable m = new Tank();
		TankTimeProxy ttp = new TankTimeProxy(tlp);
		Moveable m = ttp;
		//Moveable m = tlp;
		m.move();
	}
}
