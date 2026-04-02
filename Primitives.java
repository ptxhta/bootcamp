public class Primitives {
  //RAM -> Stack, Heap Memory (Short Term) -> after main method complete 
  // the assigned memory will be released. 
  public static void main(String[] args) {
    //int = integer
    // appleCount -> vatibale
    int appleCount = 100;

    //double = with demical 

    double applePrice = 4.99;

    // Java = cannot convert different type of data directly
    // i.e. int organcePrice = 10.99; 

    System.out.println("hello");
    System.out.println(appleCount);
    System.out.println(applePrice);

    //Primitive (Raw Datat Type)
    // int, byte, short, long
    // double, float
    // boolean
    //char
    
    //True or false
    boolean b1 = false;
    boolean isElderly = false;
    System.out.println(isElderly);

    //Single character only
    char c1 = 'a';
    char c2 = '!';
    char c3 = '+';
    char c4 = ' ';

    //Java -> Integer ()

    //Declaration
    // Assign fixed Memory for i1
    // -2,1xx,xxx,xxx to + 2,1xx,xxx,xxx
    int i1;

    int i3 = 2100000000;
    //Re-define is not allowed
    //double i1;

    //Assignment 
    i1 = 100;

    // delcalre + assign
    int i2 = 200;

    // long 2^63

    //byte (-128 to 127)
    byte by1 = -128;
    // byte by3 = -129;

    // short
    // -32768 to 32767
    short s1 = 32767;
    short s2 = -32767;

    // 1,000,000
    int k1 = 1_000_000;

    //double, float 
    // d1 (double variable)
    // 100.99 (double value)
    // 100.99d (double value)
    double d1 = 100.99;

    // 100.99f (float value)
    // f1 (florat variable
    // so we can assign a float value into a float variable
    float f1 = 100.99f;

    //You cannot assign a double value into a float varibale 
    //float f2 = 100.99;

    // 100 = int value
    // i20 - int vatiable
    // 100L - long value
    int i20 = 100;
    long l20 = 200L;

    // '9' -> char value
    // c9 -> char variable 
    char c9 = '9';

    // true/false -> boolean value

    // + - 
    char c10 = 'a';
    // ! char + int -> int
    System.out.println('a' + 1); //98

    // ! assign 98 into c11
    //! char + int -> int
    char c11 = 'a' + 1;
    System.out.println(c11); //b

    char c12 = 'a' + 25;
    System.out.println(c12); //z

    char ch1 = 'a';
    char ch2 = 'b';
    if (ch2 > ch1){
      System.out.println("ch2 ascii > ch1 ascii");
    }
  }  
}
