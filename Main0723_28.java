package demo;

public class Main0723_28 {
	public static void main(String... args) {
		try (var r = new SafeResouce()) {
			r.load();
			System.out.print("try: ");
		}
	}
}

class SafeResouce implements AutoCloseable {
	public void load() throws RuntimeException {
		System.out.print("load: ");
	}

	@Override
	public void close() throws RuntimeException {
		System.out.println("close: ");
	}
}
