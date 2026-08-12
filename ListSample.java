import java.util.List;
import java.util.ArrayList;

public class ListSample {
  public static void main(String[] args) {

    // 1.Listを作って要素を追加する
    List<String> names = new ArrayList<>();
    System.out.println("1. 追加する");
    System.out.println("追加前の件数:" + names.size());
    names.add("田中太郎");
    names.add("佐藤花子");
    names.add("鈴木一郎");
    System.out.println("追加後の件数:" + names.size());

    // 2.番号を指定して取り出す
    System.out.println("2. 取り出す");
    System.out.println("0番目:" + names.get(0));
    System.out.println("1番目:" + names.get(1));
    System.out.println("2番目:" + names.get(2));

    // 3.拡張for文で全件表示
    System.out.println("3. 全件表示");
    for (String name : names) {
      System.out.println(name);
    }

    // 4.あとから追加・変更・削除する
    System.out.println("4. 変更する");
    names.add("山田次郎");
    System.out.println("追加後の件数:" + names.size());
    names.set(1, "高橋美咲");
    names.remove(0);
    System.out.println("削除後の件数:" + names.size());
    for (String name : names) {
      System.out.println(name);
    }

    // 5.存在チェック
    System.out.println("5. 含まれているか");
    if (names.contains("鈴木一郎")) {
      System.out.println("鈴木一郎は在籍しています");
    } else {
      System.out.println("鈴木一郎は在籍していません");
    }

    // 6.数値のListで集計する
    System.out.println("6. 点数の集計");
    List<Integer> scores = new ArrayList<>();
    scores.add(80);
    scores.add(95);
    scores.add(60);
    int sum = 0;
    for (int score : scores) {
      sum = sum + score;
    }
    System.out.println("合計:" + sum);
    System.out.println("平均:" + sum / scores.size());

    // 7.空かどうかの判定
    System.out.println("7. 検索結果の判定");
    List<String> searchResult = new ArrayList<>();
    if (searchResult.isEmpty()) {
      System.out.println("該当するデータがありません");
    } else {
      System.out.println("該当件数:" + searchResult.size());
    }

    //8. 商品名のListを作る
    System.out.println("演習4");
    List<String> fruits = new ArrayList<>();
    fruits.add("りんご");
    fruits.add("みかん");
    fruits.add("ぶどう");
    fruits.add("もも");

    for (int i = 0; i < fruits.size(); i++) {
      System.out.println(i+1 + ". " + fruits.get(i));
    }

     if (fruits.contains("みかん")) {
      System.out.println("みかんはあります");
    } else {
      System.out.println("みかんはありません");
    }

    System.out.println("商品の件数:" + fruits.size());
  }
}