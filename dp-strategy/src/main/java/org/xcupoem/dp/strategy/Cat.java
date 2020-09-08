package org.xcupoem.dp.strategy;

@SuppressWarnings("all")
public class Cat implements java.lang.Comparable<Cat> {
	private int height;
	// private Comparator comparator = new CatHeightComparator();
	private java.util.Comparator<Cat> comparator = new CatHeightComparator();

	
	public java.util.Comparator getComparator() {
		return comparator;
	}

	public void setComparator(java.util.Comparator comparator) {
		this.comparator = comparator;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Cat(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	private int weight;

	@Override
	public String toString() {    //当输出此对象时会自动调用此方法
		return height + "|" + weight;
	}

	public int compareTo(Cat o) {
		return comparator.compare(this, o);
	}
}
