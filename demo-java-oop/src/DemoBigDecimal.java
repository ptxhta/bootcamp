import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // 0.1 +0.2
    System.out.println(0.1+0.2);

    //solution
    // new BigDecimal ("0.1")
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");

    BigDecimal result = bd1.add(bd2);
    System.out.println(result); //0.3

    double salary = 22500.99;
    double bonus = 1500.99;

    //! 2 BigDecimal.valueOf
    BigDecimal bonus2 = BigDecimal.valueOf(1500.99);
    BigDecimal result2 = BigDecimal.valueOf(22500.99)
      .add(BigDecimal.valueOf(1500.99));
    System.out.println(result2); //24001.98

    // + add
    // - subtract 
    // * multiply
    // /dive 

    // - subtract
    BigDecimal result3 = BigDecimal.valueOf(0.3)
    .subtract(BigDecimal.valueOf(0.1));
    System.out.println(result3);

    // multiply (0.1 * 0.2) -> 0.02
    BigDecimal result4 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
    System.out.println(result4);

    // Divide 
    // 10/3 = 3.33333
    // rounding 

    //BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3))
    BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2,RoundingMode.HALF_UP); //Half -->5
    System.out.println(result5);

    BigDecimal result6 = BigDecimal.valueOf(6.7).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_DOWN);
    System.out.println(result6);


    BigDecimal bd3 = BigDecimal.valueOf(10.0);
    BigDecimal bd4 = BigDecimal.valueOf(0.0);
    // risk (Divide Zero) -> avoid
    if (!bd4.equals(BigDecimal.valueOf(0.0))){
      BigDecimal result7 = bd3.divide(bd4, 1, RoundingMode.HALF_DOWN);
    } else{
      System.out.println("sorry, bd4 can not be zero");
    }
  }
  
}
