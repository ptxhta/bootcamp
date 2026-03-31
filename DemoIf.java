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
    int x = 13;
    int y = 14;
    if (x > 15 || y > 6 && y < 20){
      System.out.println("correct");
    }

    // double, char, string (comparsion)
    // String -> methods
  }
  
}
