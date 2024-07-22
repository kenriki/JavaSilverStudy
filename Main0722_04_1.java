package demo;

public class Main0722_04_1 {
	public static void main(String... args) {
		System.out.println( new Rectangle().calc());
	}
}

sealed interface Shape permits Rectangle {
}

//record Rectangle(Long heigh, Long width) implements Shape {
//	public long calc() {
//		Long height = this.heigh;
//		Long wight = this.width;
//		return height * wight;
//	}
//}

final class Rectangle implements Shape {
	public Integer calc() { return 100; }
}
