package demo.sample2;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 健康管理メインクラス
 */
public non-sealed class HealthChecker extends WeightBMI {
	
	private final String TITLE = "BMI計測ツール";
	private final String LABEL_1 = "身長";
	private final String LABEL_2 = "体重";
	private final String LABEL_3 = "結果!!";
	private final String BUTTON_1 = "計測";

	public static void main(String... args) {
		launch(args);
	}

	/**
	 * BMI計算メソッド
	 */
	@Override
	protected BigDecimal getValueBMI(HealthInput input) {
		BigDecimal result;
		// 170(cm) ÷ 100.00=1.7(m)
		// BMI = 体重(kg) × (身長(m))の二乗
		double dHeight = (input.height() / 100) * (input.height() / 100);
		double d = Math.floor(dHeight * 10) / 10;
		result = BigDecimal.valueOf(input.weight() / (d));
		result = result.setScale(2, RoundingMode.HALF_UP); //切り捨て  
		return result;
	}

	/**
	 * BMI結果
	 */
	@Override
	protected String getValueBMIStyle(BigDecimal bmi) {
		BigDecimal diff1 = new BigDecimal(18.5); //低体重
		BigDecimal diff2 = new BigDecimal(25); //標準体重

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

	@Override
	public void start(Stage arg0) throws Exception {
		// パネル定義
		Group grp = new Group();
		Canvas cvs = new Canvas();
		Scene s = new Scene(grp, 300, 300);

		// 各種パネルセット
		arg0.setScene(s);
		grp.getChildren().add(cvs);

		// 身長、体重を入力するエリアの宣言
		TextField text1 = new TextField();
		TextField text2 = new TextField();
		text1.setMaxWidth(200);
		text2.setMaxWidth(200);

		// 出力用エリアの宣言
		TextField output = new TextField();
		output.setMaxWidth(200);

		// ラベルやボタンの配置のための宣言
		Label name1 = new Label(LABEL_1);
		Label name2 = new Label(LABEL_2);
		Label name3 = new Label(LABEL_3);
		name1.setFont(new Font(30));
		name2.setFont(new Font(30));
		name3.setFont(new Font(30));
		name1.setAlignment(Pos.CENTER);
		name2.setAlignment(Pos.CENTER);
		name3.setAlignment(Pos.CENTER);
		Button btn = new Button(BUTTON_1);

		// 測定押下イベント
		btn.setOnAction((ActionEvent event) -> {
			if (text1.getText() == "" || text1.getText() == "") {
				return;
			}
			// TextFieldからDoubleへ変換して格納
			double height = (Double) (Double.parseDouble(text1.getText()));
			double width = (Double) (Double.parseDouble(text2.getText()));

			// Recordクラスにインプット情報を保持
			HealthInput healInput = new HealthInput(height, width);

			// BMI数値を取得する
			BigDecimal result = this.getValueBMI(healInput);

			// BMIの結果を日本語で取得する
			String bmiStyleResult = this.getValueBMIStyle(result);
			output.setText(bmiStyleResult + "/" + result.toString());
		});

		// 配置
		VBox vbRoot = new VBox();
		vbRoot.setAlignment(Pos.CENTER);
		vbRoot.getChildren().add(name1);
		vbRoot.getChildren().add(text1);
		vbRoot.getChildren().add(name2);
		vbRoot.getChildren().add(text2);
		vbRoot.getChildren().add(btn);
		vbRoot.getChildren().add(name3);
		vbRoot.getChildren().add(output);

		arg0.setTitle(TITLE);
		arg0.setWidth(350);
		arg0.setHeight(350);
		arg0.setScene(new Scene(vbRoot));

		// ウィンドウ表示
		arg0.show();

		// 描画
		//				GraphicsContext g = cvs.getGraphicsContext2D();
		//				g.setFill(Color.GREEN);
		//				g.fillRect(10, 10, 50, 50);

	}

}
