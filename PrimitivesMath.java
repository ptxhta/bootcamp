public class PrimitivesMath {
  public static void main(String[] args) {
    int count = 3;
    int price = 10;

    // Java: int value * int value -> int value
    // Assign int value into int variable (OK)
    int total = count * price;
    System.out.println(total);

    int totalScore = 750;
    int peopleCount = 8;

    // Java: int value / int value -> int value (93)
    int average = totalScore / peopleCount;
    System.out.println(average);

    // Java: int value / int value -> int value (93)
    // Assign int value into double variable (93 -> 93.0)
    double average2 = totalScore / peopleCount;
    System.out.println(average2);

    // Math /0 -> error

    int k = 100 + 300;
    System.out.println(k);

    // re-assignment 
    k = 900;
    System.out.println(k);

    //Overflow 
    byte b1 = -128;
    // byte value - int value -> int value;
    System.out.println(b1 - 1); //-129

    //byte value - int value --> int value
    // I take my own risk 
    b1 = (byte) (b1 - 3); // assign -129 into b1
    System.out.println(b1); //125

    int amount = 2_100_000_000;
    //int value + int value -> int value
    // assign int value into int variable
    amount = amount + 100_000_000;

    System.out.println(amount);//-2094967296 (overflow)

    // int value + long value -> long value
    amount = 2_100_000_000;
    long totalAmount = amount + 100_000_000L;
    System.out.println(totalAmount);

    // double cant add together 
    double k2 = 0.1;
    double k3 = 0.2;
    System.out.println(k2 + k3); // 0.300000000000000000000000004
  }
  
}
