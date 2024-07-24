package demo;

import java.util.List;
interface Calculator { void calc(); }
interface ShapeX { void draw(); }                        // (A)
record RectangleX(double height, double width)
                                    implements Calculator {
    public void calc() {
        double d = height * width;
        System.out.print("Rectangle:" + d + "sq.cm. ");
    }
}
record Triangle(double base, double height)
                                    implements Calculator {
    public void calc() {
        double d = base * height / 2;
        System.out.print("Triangle:" + d + "sq.cm. ");
    }
}
record Circle(double radius) implements Calculator, ShapeX {
    public void calc() {                                // (B)
        double d = Math.pow(radius, 2) * 3.14;
        System.out.print("Circle:" + d + "sq.cm. ");
    }
    public void draw() { System.out.print("drawing..."); }
}
public class Main0724_EX2_57 {
    public static void main(String[] args) {
        List<Calculator> list =
                    List.of(new RectangleX(2.0, 5.0),
                    new Triangle(5.0, 4.0), new Circle(3.0));
        execute(list);
    }
    public static void execute(List<Calculator> list) {
        for (Calculator calc : list) {
            calc.calc();                            // (C)
            // calc.draw();
            if(calc instanceof ShapeX s) s.draw();   // (D)
        }
    }
}

