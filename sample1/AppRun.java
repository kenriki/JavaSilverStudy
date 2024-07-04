package demo.sample1;

public class AppRun {
   public static void main(String[] args){
    Rectangle rectangle = new Rectangle(50, 100);
    double x = rectangle.getArea();
    double y = rectangle.getPerimeter();
    System.out.println("面積計算結果: "+x);
    System.out.println("周囲の長さを計算した結果: "+y);
   }
}
