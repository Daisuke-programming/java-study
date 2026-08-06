public class Conditions {
  public static void main(String[] args) {

    // 基本のif
    int age = 25;
    if (age >= 20) {
      System.out.println("成人です");
    }

    // if-else
    int stock = 0;
    if (stock > 0) {
      System.out.println("在庫あり");
    } else {
      System.out.println("在庫切れ");
    }

    // if-else
    int score = 40;
    if (score >= 90) {
      System.out.println("評価: A");
    } else if (score >= 70) {
      System.out.println("評価: B");
    } else if (score >= 50) {
      System.out.println("評価: C");
    } else {
      System.out.println("評価: D");
    }

    // 複数条件の組み合わせ
    boolean isMember = true;
    int totalPrice = 5000;
    if (isMember && totalPrice >= 3000) {
      System.out.println("送料無料");
    } else {
      System.out.println("送料500円");
    }

    // 文字列の比較
    String status = "ACTIVE";
    if ("ACTIVE".equals(status)) {
      System.out.println("有効な会員です");
    } else {
      System.out.println("無効な会員です");
    }

    // 演習４
    // 値段設定
    int price = 1000;

    double discountRate;
    if (price >= 10000) {
      discountRate = 0.2;
    } else if (price >= 5000) {
      discountRate = 0.1;
    } else if (price >= 3000) {
      discountRate = 0.05;
    } else {
      discountRate = 0.0;
    }
    int discountedPrice = (int)(price * (1 - discountRate));
    System.out.println("割引後の価格: " + discountedPrice + "円");
  }
}
