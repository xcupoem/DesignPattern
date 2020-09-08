package org.xcupoem.dp.iterator;

import org.xcupoem.dp.iterator.Collection;

public class ArrayList implements Collection {  //可增大的数组
	Object[] objects = new Object[10];
	int index = 0;
	public void add(Object o) {
		if(index == objects.length) {
			Object[] newObjects = new Object[objects.length * 2];  //数组扩展
			System.arraycopy(objects, 0, newObjects, 0, objects.length);  //数组拷贝
			objects = newObjects;  //引用指向新地方
		}
		objects[index] = o;
		index ++;
	}
	
	public int size() {
		return index;
	}
	
	public Iterator iterator() {
		
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements Iterator {		//内部类
		private int currentIndex = 0;

		public boolean hasNext() {	//判断遍历是否到结尾
			if(currentIndex >= index) return false;
			else return true;
		}

		public Object next() {		//下一个节点
			Object o = objects[currentIndex];
			currentIndex ++;
			return o;
		}
		
	}
}
