import java.math.BigDecimal;

public class Order {
  //id
  private String address;
  private Item[] items;

  public Order(){


  }

  public Order(Item[] items){
    this.items = items;
    
  }

  // return type always keep primitive (Best Practice)
  public double totalAmount(){
    //sum
    BigDecimal sum = BigDecimal.ZERO;
    for(int i =0; i< items.length; i++){
      Item item = items[i];
      double subTotal = item.subTotal();
      sum = sum.add(BigDecimal.valueOf(subTotal));
    }
    return sum.doubleValue();
  }
  
  public static void main(String[] args) {
  }
}
