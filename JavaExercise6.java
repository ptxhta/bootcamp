public class JavaExercise6 {
  // Sum values of an array
  public static void main(String[] args) {
    int count = 0; // 用嚟計住搵到第幾個符合條件嘅數字
     // Print the numbers fulfill the below criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. First ten numbers
    for (int i = 0; i < 100; i++) {
      // code here ...
      if (i % 2 == 0 && i % 3 == 0 && i != 0) {
        System.out.println(i);
        count++;
    }
      if (count == 10){
        break;
      }
  }
  }
} 
