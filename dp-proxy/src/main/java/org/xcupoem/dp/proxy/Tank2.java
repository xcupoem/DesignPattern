package org.xcupoem.dp.proxy;

public class Tank2 extends Tank {
	//利用继承实现move方法内运行的时间
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		super.move();//动态代理
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));
	}
	
}
