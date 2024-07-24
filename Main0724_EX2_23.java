package demo;

public class Main0724_EX2_23 {
	public static void main(String... args) {
		new Drink().print();
	}
}

sealed interface Food extends ItemX permits Drink {
	void print();
}

record Drink() implements Food, ItemX{

	@Override
	public void print() {
		System.out.println("Drinkのrecordです");
		
	}
}

interface ItemX {}