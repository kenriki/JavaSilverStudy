package demo.sample6.App10_68;

public class B extends A {

	public B() {
		super();
	}

	public B(String str) {
		System.out.println("B:constructor");
	}

	public void sample() {
		super.sample();
	}

	public void sample(String str) {
		System.out.println("B:sample");
	}

}
