package demo.sample3;

import java.io.IOException;

class X {
	public void print() throws IOException {
		throw new IOException();
	}
}

public class App10_18 {

	public static void main(String[] args) throws Exception{
		X obj = new X();
		obj.print();
	}

}
