package demo.sample2;

import java.io.IOException;
import java.math.BigDecimal;

// BMI値計算クラス（抽象クラス）
abstract sealed public class HealthCalclation extends FxBase permits HealthChecker{
    // BMIを計算して返す抽象メソッド
    protected abstract BigDecimal getValueBMI(HealthInput in) throws IOException;

    // BMIを計算して判定結果を返す抽象メソッド
    protected abstract String getValueBMIStyle(BigDecimal x);
}