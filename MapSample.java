import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSample {
  public static void main(String[] args) {

    // 1.Mapを作って登録する
    Map<String, String> prefCodes = new LinkedHashMap<>();
    System.out.println("--- 1.登録する ---");
    System.out.println("登録前の件数:" + prefCodes.size());
    prefCodes.put("東京都", "13");
    prefCodes.put("大阪府", "27");
    prefCodes.put("愛知県", "23");
    System.out.println("登録後の件数: " + prefCodes.size());

    // 2.キーを指定して取り出す
    System.out.println("--- 2. 取り出す ---");
    System.out.println("東京都のコード" + prefCodes.get("東京都"));
    System.out.println("大阪府のコード" + prefCodes.get("大阪府"));
    System.out.println("愛知県のコード" + prefCodes.get("愛知県"));

    // 3.存在チェック
    System.out.println("--- 3. 存在するか ---");
    if (prefCodes.containsKey("東京都")) {
      System.out.println("東京都は登録済みです");
    } else {
      System.out.println("東京都は登録済みです");
    }
    if (prefCodes.containsKey("北海道")) {
      System.out.println("北海道は登録済みです");
    } else {
      System.out.println("北海道は未登録です");
    }

    // 4. 未登録の時の規定値
    System.out.println("--- 4. 規定値を使う ---");
    String code = prefCodes.getOrDefault("北海道", "不明");
    System.out.println("北海道のコード: " + code);

    // 5. 上書きされることの確認
    System.out.println("--- 5. 同じキーで登録する ---");
    System.out.println("変更前: " + prefCodes.get("東京都"));
    prefCodes.put("東京都", "99");
    System.out.println("変更後: " + prefCodes.get("東京都"));
    System.out.println("件数: " + prefCodes.size());
    prefCodes.put("東京都", "13");

    // 6. 全件を取り出す
    System.out.println("---6. 全件表示 ---");
    for (Map.Entry<String, String> entry : prefCodes.entrySet()) {
      System.out.println(entry.getKey() + " → " + entry.getValue());
    }

    // 7. 件数を数えるMap
    Map<String, Integer> countByPref = new HashMap<>();
    System.out.println("--- 7. 都道府県別の件数 ---");
    countByPref.put("東京都", 45);
    countByPref.put("大阪府", 32);
    int total = 0;
    for (Map.Entry<String, Integer> entry : countByPref.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue() + "件");
      total = total + entry.getValue();
    }
    System.out.println("合計: " + total + "件");

    // 8.空かどうかの判定
    System.out.println("--- 8. 検索結果の判定 ---");
    Map<String, String> searchResult = new HashMap<>();
    if (searchResult.isEmpty()) {
      System.out.println("該当するデータがありません");
    } else {
      System.out.println("該当件数: " + searchResult.size());
    }

    // // 演習２
    // String code2 = prefCodes.get("北海道");
    // System.out.println(code2.length());

    // 演習４
    System.out.println("演習４");
    Map<String, String> fruits = new LinkedHashMap<>();
    fruits.put("A001", "りんご");
    fruits.put("A002", "みかん");
    fruits.put("A003", "ぶどう");

    System.out.println("商品名: " + fruits.get("A002"));

    if (fruits.isEmpty()) {
      System.out.println("該当データはありません");
    } else {
      System.out.println("商品名: " + fruits.get("A999"));
    }

    System.out.println("登録件数: " + fruits.size());

  }

}
