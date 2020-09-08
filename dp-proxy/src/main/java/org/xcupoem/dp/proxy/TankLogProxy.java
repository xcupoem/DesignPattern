package org.xcupoem.dp.proxy;

public class TankLogProxy implements Moveable {
	Moveable t;//一个类中含有另一个类的对象--聚合
	
	public TankLogProxy(Moveable t) {
		super();
		this.t = t;
	}

	public void move() {//日志记录
		System.out.println("tank start....");
		t.move();//动态代理
		System.out.println("tank end....");
		
	}
	
}

