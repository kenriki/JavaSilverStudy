package demo.sample2;

//import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 健康管理メインクラス
 */
public class HealthChecker extends WeightBMI {

    // 身長 メンバ変数
    private double height;
    // 体重 メンバ変数
    private double weight;

    // コンストラクタ
    public HealthChecker(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    /**
     * BMI計算メソッド
     */
    @Override
    protected BigDecimal getValueBMI() {
        BigDecimal result;
        // 170(cm) ÷ 100.00=1.7(m)
        // BMI = 体重(kg) × (身長(m))の二乗
        // 以下はユーザ入力を考慮した場合
        // Scanner scanner = new Scanner(System.in);
        // double height = scanner.nextDouble();
        // double weight = scanner.nextDouble();
        double dHeight = (this.height / 100) * (this.height / 100);
        double d = Math.floor(dHeight * 10) / 10;
        result = BigDecimal.valueOf(this.weight / (d));
        result = result.setScale(2, RoundingMode.HALF_UP); //切り捨て  
        return result;
    }

    /**
     * BMI結果
     */
    @Override
    protected String getValueBMIStyle(BigDecimal bmi) {
        BigDecimal diff1 = new BigDecimal(18.5); //低体重
        BigDecimal diff2 = new BigDecimal(25);   //標準体重

        int result1 = bmi.compareTo(diff1);
        int result2 = bmi.compareTo(diff2);
        
        if (result1 == -1) {
            return "低体重";
        } else if (result2 == -1) {
            return "標準体重";
        } else {
            return "肥満";
        }
    }

}
