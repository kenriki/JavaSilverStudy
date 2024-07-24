package demo.Main0724Ex2_54.ext;
import demo.Main0724Ex2_54.base.Base;

public class Derived extends Base implements Extension {
    public Derived(String name) { super(name); }
    public void print() { System.out.print(super.name); }

    public static void main(String... args) {
        Base b = new Derived("Derived ");
        b.print();
        b = new Base("Base ");
        b.print();
        Derived d = (Derived)new Base();
    }
}
