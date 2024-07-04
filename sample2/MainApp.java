package demo.sample2;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {
        // 健康チェッカークラスを呼ぶ
        HealthChecker healthValue = new HealthChecker(167,67);
        // BMI数値を取得する
        BigDecimal result = healthValue.getValueBMI();
        System.out.println("あなたのBMI値は、" + result);
        // BMIの結果を日本語で取得する
        String bmiStyleResult = healthValue.getValueBMIStyle(result);
        System.out.println("あなたのBMIは、" + bmiStyleResult+"です");
    }
}
