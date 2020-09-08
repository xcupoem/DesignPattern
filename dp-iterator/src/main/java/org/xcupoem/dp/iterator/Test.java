package org.xcupoem.dp.iterator;

import org.xcupoem.dp.iterator.ArrayList;

public class Test {
	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		//LinkedList al = new LinkedList();
		Collection c = new ArrayList();   //面向接口编程
		for(int i=0; i<15; i++) {
			c.add(new Cat(i));
		}
		System.out.println(c.size());
		
		Iterator it = c.iterator();		//统一接口
		while(it.hasNext()) {			//统一遍历方式
			Object o = it.next();
			System.out.print(o + " ");
		}
	}
}


