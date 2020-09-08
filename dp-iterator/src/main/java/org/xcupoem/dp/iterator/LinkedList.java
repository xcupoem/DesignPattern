package org.xcupoem.dp.iterator;

import org.xcupoem.dp.iterator.Collection;

public class LinkedList implements Collection {
	Node head = null;
	Node tail = null;
	int size = 0; //记录元素的多少  冗余数据方便统计数据的多少
	public void add(Object o) {
		Node n = new Node(o, null);
		if(head == null) {
			head = n;
			tail = n;
		}
		tail.setNext(n);  //新尾节点的下一个节点
		tail = n;  //新尾节点
		size ++;
	}
	
	public int size() {
		return size;
	}

	public Iterator iterator() {
		return null;
	}
	
	/*
	private class LinkedListIterator implements Iterator {
		int i = 1;
		Node flag = head;
		@Override
		public Object next() {
			if(hasNext())
				return flag;
			return null;
		}

		@Override
		public boolean hasNext() {
			if(i <= size) {
				flag = flag.getNext();
				i++;
				return true;
			} else {
				return false;
			}
			
		}
	}*/

	
}
