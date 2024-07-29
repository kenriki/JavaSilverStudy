package demo.sample2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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
	private final String OUTPUT_FILE_NAME = "data.csv";
	private final String comma = ",";
	private final String ERR_MSG_1 = "【未入力エラー】\r\n 必須入力欄が未入力となっています。";
	private final String ERR_MSG_2 = "【実行時エラー】\r\n インプットデータ(data.csv)がありません。\r\n 次の画面で身長、体重を入力して計測を開始してください。";
	
	public static void main(String... args) {
		launch(args);
	}

	/**
	 * BMI計算メソッド
	 * @throws IOException 
	 */
	@Override
	protected BigDecimal getValueBMI(HealthInput input) throws IOException {
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
	 * データ内容をCSVに書き込む
	 * @param bmiStyleResult
	 * @param result
	 * @param input
	 * @throws IOException
	 */
	private void saveCsvFile(String bmiStyleResult, BigDecimal result, HealthInput input) throws IOException {
		// csvに入力値とBMI結果を保持
		FileWriter csvWriter = new FileWriter(OUTPUT_FILE_NAME, true);
		PrintWriter pw = new PrintWriter(new BufferedWriter(csvWriter));
		pw.print((double) input.height() + comma);
		pw.print((double) input.weight() + comma);
		pw.print(bmiStyleResult + "/");
		pw.println(result.doubleValue());
		pw.close();
	}

	/**
	 * カンマ区切りでCSVデータを読み込む
	 * @param line
	 * @return
	 * @throws IOException 
	 */
	private String[] readCsvSplit() throws IOException {
		File file = new File(OUTPUT_FILE_NAME);
		FileInputStream input = new FileInputStream(file);
		InputStreamReader stream = new InputStreamReader(input, "SJIS");
		BufferedReader br = new BufferedReader(stream);
		String line;

		String[] data = null;
		while ((line = br.readLine()) != null) {
			// カンマで分割
			data = line.split(comma);
		}
		br.close();
		return data;

	}

	/**
	 * BMI結果
	 */
	@Override
	protected String getValueBMIStyle(BigDecimal bmi) {
		BigDecimal diff1 = new BigDecimal(18.5); //低体重
		BigDecimal diff2 = new BigDecimal(25); //標準体重

		//		25-30未満	肥満（１度）
		//		30-35未満	肥満（２度）
		//		35-40未満	肥満（３度）
		//		40以上	肥満（４度）

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

		// 身長、体重を入力するエリアのインスタンス取得
		TextField textHeightField = new TextField();
		TextField textWeightField = new TextField();
		// 出力用エリアの宣言
		TextField textSokuteiResultField = new TextField();

		// 前回のデータ取得して設定
		String[] data = readCsvSplit();
		if (data == null) {
			Alert alert = new Alert(AlertType.ERROR, ERR_MSG_2, ButtonType.OK);
			Optional opt = alert.showAndWait();
			if (opt.get() == ButtonType.OK) {
				textHeightField.setText("0.0");
				textWeightField.setText("0.0");
				textSokuteiResultField.setText("");
			}
		} else {
			textHeightField.setText(data[0]);
			textWeightField.setText(data[1]);
			textSokuteiResultField.setText(data[2]);
		}

		// 身長、体重を入力するエリアの準備
		textHeightField.setMaxWidth(200);
		textWeightField.setMaxWidth(200);
		textSokuteiResultField.setMaxWidth(200);

		// ラベルやボタンの配置のための宣言
		Label heightLabelName = new Label(LABEL_1);
		Label widthLabelName = new Label(LABEL_2);
		Label sokuteiResultName = new Label(LABEL_3);
		heightLabelName.setFont(new Font(30));
		widthLabelName.setFont(new Font(30));
		sokuteiResultName.setFont(new Font(30));
		heightLabelName.setAlignment(Pos.CENTER);
		widthLabelName.setAlignment(Pos.CENTER);
		sokuteiResultName.setAlignment(Pos.CENTER);
		Button sokuteiBtn = new Button(BUTTON_1);

		// 測定押下イベント
		sokuteiBtn.setOnAction((ActionEvent event) -> {
			if (textHeightField.getText() == "" || textHeightField.getText() == "") {
				Alert alert = new Alert(AlertType.ERROR, ERR_MSG_1, ButtonType.OK);
				Optional opt = alert.showAndWait();
				if (opt.get() == ButtonType.OK) {
					return;
				}
				return;
			}
			// TextFieldからDoubleへ変換して格納
			double height = (Double) (Double.parseDouble(textHeightField.getText()));
			double weidth = (Double) (Double.parseDouble(textWeightField.getText()));

			// Recordクラスにインプット情報を保持
			HealthInput healInput = new HealthInput(height, weidth);

			// BMI数値を取得する
			BigDecimal result = null;
			try {
				result = this.getValueBMI(healInput);
			} catch (IOException e) {
				e.printStackTrace();
			}

			// BMIの結果を日本語で取得する
			String bmiStyleResult = this.getValueBMIStyle(result);
			textSokuteiResultField.setText(bmiStyleResult + "/" + result.toString());

			// csvに入力値とBMI結果を保持
			try {
				saveCsvFile(bmiStyleResult, result, healInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		// 配置
		VBox vbRoot = new VBox();
		vbRoot.setAlignment(Pos.CENTER);
		vbRoot.getChildren().add(heightLabelName);
		vbRoot.getChildren().add(textHeightField);
		vbRoot.getChildren().add(widthLabelName);
		vbRoot.getChildren().add(textWeightField);
		vbRoot.getChildren().add(sokuteiBtn);
		vbRoot.getChildren().add(sokuteiResultName);
		vbRoot.getChildren().add(textSokuteiResultField);

		arg0.setTitle(TITLE);
		arg0.setWidth(350);
		arg0.setHeight(350);
		arg0.setScene(new Scene(vbRoot));

		// ウィンドウ表示
		arg0.show();

	}

}
