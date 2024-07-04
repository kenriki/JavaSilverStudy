package demo.sample3;

import java.util.Random;

public class Sample {
	int a;
	private String[] jankenSelect;
	private Random rand;
	static int b;

	public Sample(int ns) {
		if (b < ns) {
			b = ns;
			this.a = ns;
		}
	}

	public Sample() {
		Random rand = new Random();
		String[] jankenSelect = { "グー", "チョキ", "パー" };
		this.jankenSelect = jankenSelect;
		this.rand = rand;
	}

	void doPrint() {
		System.out.println("a= " + a + ",b= " + b);
	}

	String janken() {
		return this.jankenSelect[this.rand.nextInt(3)];
	}
}