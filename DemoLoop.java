public class DemoLoop {
  public static void main(String[] args) {
    // For Loop
    // intialization -> int i = 0;
    // continue criteria -> i < 3
    // Each Iteration End -> i++
    for(int i = 0; i < 3; i++){
      System.out.println("hello");
    }
    // Step1 : int i = 0;
    // Step2 : check if i < 3
    // Step 3: print bye 
    // ste 4: i ++ 
    // Step 5: check if i < 3;
    //step6: print bye
    //Step 7: i++
    //Step 8: check if i< 3
    //step 9: print bye
    //Step 10: i++
    // Step 11: check if i < 3( i = 3)
    // STep 12: exit loop


    // Print even number 
    for (int i = 0; i < 10; i++){ //0-9
      if (i % 2 == 0){
        System.out.println(i);
      }
    }

    // Print the numbers between 0 - 99, which divided by 3, and it is greater than 50
    for (int i =0; i < 100; i++){
      if(i > 50 && i % 3 == 0){
        System.out.println(i);
      }
    }

    // hello 
    // Find if character l exits (not use contain or indexof)
    String s = "hello";
    Boolean isTargetExits = false;
    for (int i = 0; i < s.length(); i++){
      System.out.println(s.charAt(i));
      if(s.charAt(i) == 'l'){
        isTargetExits = true;
        break; // break nearest loop
      }
    }
    System.out.println(isTargetExits);


    String s2 = "947852106"; // Find the largest even digit
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < s2.length(); i++){
      int digit = s2.charAt(i) - '0';
      if(digit % 2 == 0 && digit > max){
          max = digit;
      }
    }
    System.out.println(max);

    String s3 = "8A3ahs0nd3";
    //ahsnd
    String result = "";
    for (int i = 0; i < s3.length(); i++){
      char c = s3.charAt(i);
      if (c >= 'a' && c <= 'z'){
      result += c;
      }
    }
    System.out.println(result);

    // "725094849"
    // Find the largest index of the largest digit
    //8 
    String s = "725094849" ;
    int maxDigit = -1;
    int maxIndex = -1;
    for (int i = 0; i < s.length(); i++){
      int digit = s.charAt(i) - '0'; // 變身做真數字
    }if (digit >= maxDigit) { 
        maxDigit = digit;
        maxIndex = i; // 每次見到「一樣大」或者「更大」嘅數，都更新位置
    }
    }
    System.out.println("Largest Index: " + maxIndex);





  }
}
