package demo.sample;

/**
 * PS C:\work\javaProgramSample\src> javac  .\demo\sample\MainApp1.java
 * PS C:\work\javaProgramSample\src> java demo.sample.MainApp1
 * 110yen
 * 1080yen
 */

interface Z {
    String EN_TANNI = "yen";
}

interface X extends Z {
    // double POINT_RATE = 0.05;
    double TAX_RATE = 1.10;

    default String calculate(int price) {
        return (int) (price * TAX_RATE) + EN_TANNI;
    }
}

interface Y extends Z {
    double TAX_RATE = 1.08;

    default Number calculate(int price) {
        return (int) (price * TAX_RATE);
    }
}

class One implements X {
    @Override
    public String calculate(int price) {
        return X.super.calculate(price);
    }
}

class Two implements Y {
    @Override
    public Integer calculate(int price) {
        // return price - 100;
        return (int) (price * TAX_RATE);
    }

    protected String resultValue(int price) {
        return this.calculate(price) + EN_TANNI;
    }
}

public class MainApp1 {
    public static void main(String[] args) {
        System.out.println(new One().calculate(100));
        System.out.println(new Two().resultValue(1000));
    }
}