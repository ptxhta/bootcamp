public class DemoIf {
  public static void main(String[] args) {
    // if 
    int age = 13;
    // >, <, >=, <=
    if (age >= 18){ //age is 13 so the result is false, skip the code block
      System.out.println("adult");
    } else{
      System.out.println("child");
    }
    if (age >=18){
      System.out.println("hello");
    }
    
    // 8 Primitives + String
    // boolean
    // = (assignment)
    // == (check if equals)
    boolean isLoggedin = true;
    if (isLoggedin) {
      System.out.println("Welcome");
    } else{
      System.out.println("plz log in");
    }


    age = 70;
    if (age > 65) {
      System.out.println("Fee = 2");
    }

    
    age = 70;
    boolean isElderly = age > 65; //true
    if (isElderly){
      System.out.println(isElderly);
    }

    if (isElderly == true) {
      System.out.println("Fee = 2");
    }

    // &&(AND) ||(OR) 
    int a = 21;
    // 2 conditions ( fulfill at the sae time)
    if (a > 5 && a <= 20){
      System.out.println("a is between 5 and 20");
    }
    
    // Fulfill one of the conditions
    if (a >=5 || a <= 20){
      System.out.println("a is either >=5 or <= 20");
    }

    // Event 1: a>15 -> True
    // Event 2: b >6 && b <20 -> true
    

    // swap
    int x = 9;
    int y = 5;
    int temp = x; // x-> backup
    x = y;
    y = temp;
    System.out.println(x);
    System.out.println(y);
    
   //Find max between 2 numbers
    int j = 10;
    int k = 5;
    int max = k;

    if (j > k){
      max = j;
    } 
      System.out.println(max);

    // Find min between 3 numbers
    int q = 10;
    int u = 2;
    int t = 8;

    int min = q; 
    if (u < min) { 
    min = u;
    } else if (t < min) { 
    min = t;   
    }

    /*
    if (q < u){
      if (q < t){
      min = q;
      } else {
        min = t;
      } else{
        if ( u < t)}
    }
    */

System.out.println("The minimum number is: " + min);


    // double, char, string (comparsion)
    // String -> methods

    int score = 78;
    // >= 90 Grade A
    // >= 80 and < 90 Grade B
    // >= 70 and < 80 Grade 70
    // Grade A or Grade B -> Excellent
    // Grade C -> Pass
    
    char grade = ' '; 
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80 && score < 90) { 
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    }

    if (grade == 'A' || grade == 'B') {
      System.out.println("Excellent");
    } else if (grade == 'C') {
      System.out.println("Pass.");
    }




    String s1 = "Java";
    if (s1.length() == 5 || s1.charAt(0) == 'J'){
      System.out.println("hello");
    } else {
      System.out.println("byebye");
    }

    //Switch
    // 1. AND OR 
    // 2. Range checking 
    // 3. break
    char gender = 'M';
    switch (gender){
      case 'M': 
        System.out.println("He is a men");
        break;
      case 'F':
        System.out.println("She is a female");
        break;
      default:
        System.out.println("Invalid Gender");
    }

    // def leap year
      int year = 2100;
      boolean isLeapYear = false; 
      if (year % 400 == 0){
        isLeapYear = true; // divided by 400 that is not leapyear so isleapyear = falso is true.
      } else if ( year % 100 == 0){
        isLeapYear = false;
      } else if (year % 4 == 0){
        isLeapYear = true;
      } else{
        isLeapYear = false;
      }
      if (isLeapYear) {
          System.out.println(year + " is a leap year.");
        } else {
          System.out.println(year + " is NOT a leap year.");
      }

      

  }
}
