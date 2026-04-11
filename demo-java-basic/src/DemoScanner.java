import java.util.Scanner; //JDK

public class DemoScanner {
  public static void main(String[] args) {
    // Scanner for collect user input
    Scanner s = new Scanner(System.in);
    System.out.println("plz input a number");
    int number = s.nextInt(); //Pause
    System.out.println(number);

    //Even Number -> "It's an even number."
    //Odd Number -> "It's an odd number."
    int num = 10;
    if (num % 2 == 0){
      System.out.println("It's an even number.");
    } else{
      System.out.println("It's an odd number.");
    }

  }
}
