public class Loop {
  public static void main(String[] args) {

    // 基本の繰り返し
    System.out.println("---1. 5回繰り返す---");
    for (int i = 0; i < 5; i++) {
      System.out.println("iの値: " + i);
    }

    // 1から始めたいとき
    System.out.println("---2. 1から5まで ---");
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + "回目");
    }

    // 合計を計算する
    System.out.println("---3. 1から10までの合計---");
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
    }
    System.out.println("合計: " + sum);

    // 繰り返しの中で条件分岐
    System.out.println("---4. 1から10のうち偶数だけ---");
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " は偶数");
      }
    }

    // 逆順に数える
    System.out.println("--- 5. カウントダウン ---");
    for (int i = 3; i >= 1; i--) {
      System.out.println(i);
    }
    System.out.println("発射！");

    // 演習２
    System.out.println("---演習２---");
    for (int i = 3; i <= 7; i++) {
      System.out.println("実行: " + i);
    }

    // 演習３
    System.out.println("---演習３---");
    int sum1 = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        sum1 += i;
      }
    }
    System.out.println("3で割り切れる数の合計: " + sum1);

    // 演習４
    // System.out.println("---演習４---");
    // for (int i = 0; i < 5; i--) {
    //   System.out.println(i);
    // }
  }
}