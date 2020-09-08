package org.xcupoem.dp.proxy;

public class TankTimeProxy implements Moveable {
	Moveable t;//一个类中含有另一个类的对象--聚合
	
	public TankTimeProxy(Moveable t) {
		super();
		this.t = t;
	}

	public void move() {
		long start = System.currentTimeMillis();
		System.out.println("start:" + start);
		t.move();//动态代理
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));
		
	}
	
}
