package org.xcupoem.dp.proxy;

import java.util.Random;

public class Tank implements Moveable {

	public void move() {
		long start = System.currentTimeMillis();
		System.out.println("tank moving......");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));
	}

}
