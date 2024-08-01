

# Javafxの実行準備

以下から自分の環境にあうJavafxのSDKをインストールする  
[https://gluonhq.com/products/javafx/](https://gluonhq.com/products/javafx/)  

コマンドプロンプトで、以下のコマンドを実行します。  

```
set PATH_TO_FX="C:\javafx-sdk-19\lib"
```

以下のコマンドでコンパイルします。  

```
javac --module-path %PATH_TO_FX% --add-modules javafx.controls HealthChecker.java
```

以下のコマンドで実行します。  

```
java --module-path %PATH_TO_FX% --add-modules javafx.controls HealthChecker
```

eclipseの設定のときは、実行構成でVM引数に上記のオプションを入れる。


