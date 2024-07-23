package demo;

//public non-sealed class Main0723_32 implements I {
//final class Main0723_32 implements I,J {
final class Main0723_32 extends A implements I {
	
	public static void main(String[] args) {
		A amethod = new A();
		amethod.print();
		System.out.print(amethod.calc(10, 10));
	}

}


sealed interface I permits A, Main0723_32 {
	default int calc(int a,int b) { return a;}
}
interface J {}
non-sealed class A implements I {
		
	public int calc(int a, int b) {
		return a * b;
	}
	void print() {
		System.out.println("A");
	}

}
final class B {}