package demo;

public class Main0722_01 {

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.calculate(100));
		
		System.out.println(Point.getBasePoint());
	}

}


interface Point {
	int basePoint = 10;
	static int getBasePoint() { return basePoint;}
	int calculate(int x);
}

class Product implements Point {
	public int calculate(int x) { return x + basePoint;}
}
