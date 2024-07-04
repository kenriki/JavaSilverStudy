package demo.sample3;

public class SubSample {
	int price;
	String name;
	int num;

	public SubSample(int price) {
		this.price = price;
	}

	public SubSample(String name, int num, int price) {
		//super();
		this.name = name;
		this.num = num;
		this.price = price;
	}
}
