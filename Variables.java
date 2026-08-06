public class Variables {
  public static void main(String[] args) {

    // 変数の宣言と初期化
    String name = "田中太郎";
    int age = 25;
    double height = 172.5;
    boolean isMember = true;
    char grade = 'A';

    // 変数の中身を表示
    System.out.println("名前: " + name);
    System.out.println("年齢: " + age);
    System.out.println("身長: " + height);
    System.out.println("会員: " + isMember);
    System.out.println("ランク: " + grade);

    // 再代入
    age = 26;
    System.out.println("誕生日後の年齢:" + age);

    // 計算に使う
    int price = 1200;
    int count = 3;
    int total = price * count;
    System.out.println("合計金額: " + total + "円");

    int a = 5;
    int b = 2;

    System.out.println(a / b);

    double c= 5;
    double d= 2;
    System.out.println(c / d);
  }
}
