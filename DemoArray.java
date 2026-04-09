import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // int type
    int age = 10;
    int johnAge = 18;
    int maryAge = 17;

    // Array: store a set of same type values
    // Array is an unit in memory
    int [] ages = new int[3];
    // Firs Box 
    ages[0] = age; // Assign 10 into the first box
    //Second box
    ages[1] = johnAge;
    //Third box 
    ages[2] = maryAge;

    //swap john and mary age (array)
    int temp = ages[1];
    ages[1] = ages[2];
    ages[2] = temp;

    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);

    for (int i =0; i < ages.length; i++){ //0,1,2
      System.out.println(ages[i]);
    }
    //System.out.println(ages[0]);
    //System.out.println(ages[1]);
    //System.out.println(ages[2]);

    //System.out.println(ages[-1]); //runtime error
    //System.out.println(ages[3]);

    //declare length 100 int array (0-99)
    int [] loginIds = new int[100]; //default value0
    // print out all values
    for (int i = 0; i < loginIds.length; i++){
      System.out.println(loginIds[i]);
    }
    // Assign 100 -199 into the array
    for(int i = 0; i< loginIds.length; i++){
      loginIds[i] = i + 100;
    }

    // two ways to declare an array (with known value set)
    char[] chs = new char[4];
    chs [0] = 'a';
    chs [1] = 'b';
    chs[2] = 'c';
    chs [3] = 'd';

    double[] prices = new double[] {99.99, 50.3, 100.0};
    // print out all prices
    for (int i = 0; i < prices.length; i++){
    System.out.println(i);//2
    }

    // sum up all prices 
    double totalPrice = 0.0;
    for (int i = 0; i< prices.length; i++){
      totalPrice += prices[i];
    }
    System.out.println("total price" + totalPrice);

    //find the min value
    double minPrice = prices[0]; 
    for (int i = 0; i < prices.length; i++){
      if(prices[i]< minPrice ){
        minPrice = prices[i];
      }
    }
    // find the max value

    // int[], double[], String[], char[], 
    char[] chs2 = new char[] {'a', 'e', 'i', 'o', 'u'};
    String name = "Mary";
    
    // loop: check the name if it contains the char value in chs2 
    boolean found = false;
    for (int i = 0; i < name.length(); i++){
      if (name.charAt(i) == chs2[0] || name.charAt(i) == chs2[1] || 
      name.charAt(i) == chs2[2] || 
      name.charAt(i) == chs2[3] || 
      name.charAt(i) == chs2[4])
      {found = true; 
      break;
      }
    }
    System.out.println(found);

    //outer loop and inner loop
    found = false;
    for (int i = 0; i< name.length(); i++){ //outer loop (every char in the name)
      for (int j = 0; j< chs2.length; j++){ //inner loop (every char in the chs2)
        if (name.charAt(i) == chs2[j]){
          found = true;
          break; // breal inner loop
        }
      }
      if (found) {
        break; //break outer loop
      }
    } 
    System.out.println(found); //true


    // 
    int[] arr2 = new int[]{100, 4, 99, 55, 17};
    //move the first number to the tail
    //swap
    for(int i=0 ; i< arr2.length -1; i++){
      int backup = arr2[i];
      arr2[i] = arr2[i+1];
      arr2[i+1] = backup;
    }
    // 100,4 ,99,55,17
    // 4,100 ,99,55,17
    // 4,99,100,55,17
    // 4,99,55,100,17
    // 4,99,55,17,100
    System.out.println(Arrays.toString(arr2));

    
    int[] arr3 = new int[]{100, 4, 200, 55, 17};
    //Move the maxx numbr in to the tail (100,4,55,17,200)
    for (int i = 0; i < arr3.length-1; i++){
      if (arr3[i]>arr3[i+1]){
        // 交換位置 (Swap)
        int temp2 = arr3[i];
        arr3[i] = arr3[i + 1];
        arr3[i + 1] = temp2;
      }
    }
    System.out.println(Arrays.toString(arr3));//4,100,55,17,200


    //Bubble sorting
    int[]arr4 = new int[]{100,4,200,55,17}; 
    for (int i = 0; i< arr4.length-1; i++){ //0,1,2,3出面嗰層：代表要做幾多輪（通常係長度減 1）how many times you move the max number
      for(int j =0 ; j<arr4.length-1-i; j++){//入面嗰層：負責「推」最大嗰粒去後面 how many moves u need for max number
        if (arr4[j] > arr4[j] + 1) {
            // 經典 Swap 動作
            int temp5 = arr4[j];
            arr4[j] = arr4[j + 1];
            arr4[j + 1] = temp5;
      }
    }
    }
    System.out.println(Arrays.toString(arr4));

    String str = "abcdefg";
    String reservedString = "";
    //reverse the string 
    //gfedcba
    for (int k = str.length()-1; k>=0; k--){
      //起點：str.length() - 1 (最後一個位)
      // 終點：k >= 0 (行到第 0 位就停)
      // 步速：k-- (每次減 1，向左行)
        reservedString += str.charAt(k);// 逐個字加落去
    }
    System.out.println(reservedString); // 輸出: gfedcba
  }
}
