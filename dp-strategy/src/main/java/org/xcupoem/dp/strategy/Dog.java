package org.xcupoem.dp.strategy;

public class Dog implements Comparable {
	public Dog(int food) {
		super();
		this.food = food;
	}

	private int food;

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int compareTo(Object o) {//比较依据
		Dog d = (Dog)o;
		if(this.food > d.getFood()) return 1;
		else if(this.food < d.getFood()) return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return this.food + "";
	}
}
