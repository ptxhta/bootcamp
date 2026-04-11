import java.awt.Color; // 記得要 import

public class Tiger {
  private Color color;

  public Tiger(Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  public void setColor(Color color){
    this.color = color;
  }

  public static void main(String[] args) {
    Tiger t1 = new Tiger(Color.RED);

    // ⚠️ 邏輯一定要寫喺 main method 入面
    if (t1.getColor() == Color.RED) { // 留意：係 RED (全大寫)
        System.out.println("呢隻係紅色老虎！");
    }
  }
}
