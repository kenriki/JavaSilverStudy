package demo.sample1;

// Triangle クラス（三角形）
non-sealed class Triangle extends Shape {
    // メンバー変数：辺の長さ（3辺）
    private double side1;
    private double side2;
    private double side3;

    // コンストラクタ
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // 面積を計算して返すメソッド（※実際の三角形の面積計算は省略）
    @Override
    double getArea() {
        // 面積を計算する具体的な処理を実装
        // ここでは単純に 0 を返していますが、実際には三角形の面積計算を実装する必要があります。
        return 0;
    }

    // 周囲の長さを計算して返すメソッド
    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}