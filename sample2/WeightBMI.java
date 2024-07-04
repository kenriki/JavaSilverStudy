package demo.sample2;

import java.math.BigDecimal;

// BMI値計算クラス（抽象クラス）
abstract public class WeightBMI {
    // BMIを計算して返す抽象メソッド
    protected abstract BigDecimal getValueBMI();

    // BMIを計算して判定結果を返す抽象メソッド
    protected abstract String getValueBMIStyle(BigDecimal x);
}