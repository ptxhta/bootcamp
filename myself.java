
class PropertyListing {
  // Class
  private String address; 
  private double squareFeet;
  private long price;
  private boolean isAvailable; 

  //constructor this.係你 Class 入面張「表」嗰個空格（正印）。
  public PropertyListing(String inputAddress, double InputSquareFeet,
    long inputPrice, boolean inputIsAvailable)
    { this.address = inputAddress;
      this.squareFeet = InputSquareFeet;
      this.price = inputPrice;
      this.isAvailable = true;
    } 

  //GETTER (取值): 「查閱權限」
  //return 就係**「交貨」，而 this.material 就係「貨物本身」**。
  //return：將呢件資料「掉出去」俾個呼叫者（Call 佢嗰個人）。
  public String getAddress(){
    return this.address;
  }
  public double getSquareFeet(){
    return this.squareFeet;
  }
  public long getPrice(){
    return this.price;
  }
  public boolean getIsAvailable(){
    return this.isAvailable;
  }

  //SETTER (設定): 「修改權限與檢查」
  //物件生產後，如果想改資料，必須經過這個「師傅」檢查
 public void setPrice(long newPrice){
  if (newPrice > 0){
    this.price = newPrice;
    System.out.println("owner changed the price as" + newPrice);
  } else {
    System.out.println("Price hasn't chhanged" +"Still");
  }
 }
  // [行為 - Method] 標示為已售出 (之後不用手動改，直接 call 這個動作)
  public void markAsSold(){
    this.isAvailable = false;
    System.out.println(">>> [狀態] 恭喜！物業 " + address + " 已售出。");
  }
}

//MAIN CLASS: 這是你真正「執行」的地方
//執行程式 (Main File: Main.java)
// 我們用同一張「設計圖」(Class)，生產兩份「實物」(Object)
// 這裡就是在調用 Constructor 抌資料進去
// have to class name 
public class myself {
  public static void main(String[] args) {
    PropertyListing flatA = new PropertyListing("太古城金楓閣 10 樓", 580.5, 9800000, true);
    PropertyListing flatB = new PropertyListing("沙田第一城 3 座", 327.0, 4500000, true);

    // --- 使用 GETTER ---
    System.out.println("放盤 A 地址: " + flatA.getAddress());
    System.out.println("放盤 A 目前售價: $" + flatA.getPrice());

    // --- 使用 SETTER ---
    flatA.setPrice(10500000);
    flatB.markAsSold();

  }
}