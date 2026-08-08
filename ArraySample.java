public class ArraySample {
  public static void main(String[] args) {

    // 1.配列を作って中身を入れる
    String[] names = { "田中太郎", "佐藤花子", "鈴木一郎" };
    System.out.println("--- 1.番号を指定して取り出す---");
    System.out.println("0番目:" + names[0]);
    System.out.println("1番目:" + names[1]);
    System.out.println("2番目:" + names[2]);
    System.out.println("要素数:" + names.length);

    // 2.forで繰り返す
    System.out.println("--- 2.forで全件表示---");
    for (int i = 0; i < names.length; i++) {
      System.out.println(i + "番目:" + names[i]);
    }

    // 3.拡張for文で全件取り出す
    System.out.println("--- 3.拡張for文で全件取り出す---");
    for (String name : names) {
      System.out.println(name);
    }

    // 4.数値の配列で合計と平均を出す
    int[] scores = { 80, 95, 60, 75, 90 };
    System.out.println("--- 4.点数の集計---");
    int sum = 0;
    for (int score : scores) {
      sum = sum + score;
    }
    System.out.println("合計: " + sum);
    System.out.println("件数: " + scores.length);
    System.out.println("平均: " + sum / scores.length);

    // 5.最大値を探す
    System.out.println("--- 5.最高点を探す---");
    int max = scores[0];
    for (int score : scores) {
      if (score > max) {
        max = score;
      }
    }
    System.out.println("最高点: " + max);

    // 6.あとから中身を入れ替える
    System.out.println("--- 6.値の入れ替え---");
    System.out.println("変更前: " + names[1]);
    names[1] = "山田次郎";
    System.out.println("変更後: " + names[1]);

    // 7.エラー体験
    // System.out.println("--- 7.エラー体験---");
    // System.out.println("3番目: " + names[3]);

    // 8.演習３
    // System.out.println("--- 8.演習３---");
    // for (int i = 0; i <= names.length; i++) {
    //   System.out.println(names[i]);
    // }

    // 9.演習４
    System.out.println("--- 9.演習４---");
    int count = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 80) {
        count++;
      }
    }
    System.out.println("80点以上: " + count + "人");
  }
}
