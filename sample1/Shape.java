package demo.sample1;

// Shape クラス（抽象クラス）
abstract sealed class Shape permits Triangle, Rectangle {
    // 面積を計算して返す抽象メソッド
    abstract double getArea();

    // 周囲の長さを計算して返す抽象メソッド
    abstract double getPerimeter();
}