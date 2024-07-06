package demo.sample1;

public non-sealed class Rectangle extends Shape {

    // メンバー変数：幅、高さ
    private double width;
    private double height;

    // コンストラクタ
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 面積を計算して返すメソッド
    @Override
    double getArea() {
        return width * height;
    }

    // 周囲の長さを計算して返すメソッド
    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
    

    

}
