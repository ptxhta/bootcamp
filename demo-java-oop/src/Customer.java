import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {
  // id 
  private String firstName;
  private String lastName;
  private char gender; 
  private LocalDate dob;

  private Order[] orders; //Array  

  //isVIP(), total amount. for all orders >100,000 return true false
  public boolean isVIP(){
    return this.totalOrderAmount() > 100_000;
  }
  public double totalOrderAmount(){
    BigDecimal sum = BigDecimal.ZERO;
    for (int i =0; i< this.orders.length; i++){
      sum = sum.add(BigDecimal.valueOf(this.orders[i]).totalAmount());
    }
    return sum.doubleValue();
  }
  

  //constructor 
  // implicity empty constructor 
  public Customer(){
    System.out.println("Cereating Customer...");
    this.orders = new Order[0];
  }



  // constructor more than once  name same as classname
  // provide 4 values
  public Customer(String firstName, String lastName, char gender, 
    LocalDate dob) {
    // creating
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.dob = dob;
  }

  // Methods
  // BirthYear - return int
  public int getBirthYear() {
    return this.dob.getYear(); // 加埋 .getYear() 先可以喺日期入面抽個年份出嚟
}

  //get set
  public String getFirstName(){
    return this.firstName;
  }

  public void addOrder(Order order){
    
  }

  public static void main(String[] args) {
    // "new" -> produce objecct (call constuctor)

    Customer c1 = new Customer();
    Customer c2 = new Customer("John", "Chan", 'M', LocalDate.of(1990, 1, 1));


    System.out.println(c2.getFirstName());//John
    System.out.println(c1.getFirstName()); //null

    System.out.println(c2.getBirthYear());//1990

    Customer c4 = new Customer();


    // 2 orders
    //Order 1: 2 item
    // Order 2: 1 item
    
    //c4.isVip -> true

    Item rice = new Item("rice", 99.5, 2);
    Item water = new Item("water", 5, 10);
    Item fish = new Item("fish", 50, 4);
    System.out.println(fish.subTotal());//200.0

    Item[] items. = new Item[2];
    items[0] = rice;
    items[1] = water;

    Item[] items2 = new itms[1];
    items2[0] = fish; 

    Order o10 = new Order(items);
    Order o11= new Order(items2);

    Order[] = orders = new Order[2];
    Orders[0] = o10;
    Orders[1] = o11;

    Customer c10 = new Customer(orders());
    System.out.println(c10.totalOrderAmount());//449.0
    System.out.println(c10.isVIP()); //False
    
  }
}
