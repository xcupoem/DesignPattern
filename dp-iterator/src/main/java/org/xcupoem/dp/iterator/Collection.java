package org.xcupoem.dp.iterator;

public interface Collection {  //统一ArrayList和LinkedList共同 公开的方法  
	void add(Object o);
	int size();
	Iterator iterator();
}
