public class DemoWrapperClass {
  public static void main(String[] args) {
    // Primitives (byte, short, long , int, float, double, char, boolean)
    byte b1 = 100; // Primitive
    Byte b2 = 100;// Class --> Wrapper class

    short s1 =100;
    Short s2 = 100;

    int x1 =100;
    if (x1 ==100){

    }
    // ALways use method for comparsion
    Integer x2 =99;
    // Integar compareto : Left > righht --> return 1
    // left < Right --> return -1
    // left = right -> return 0
    if (x2.compareTo(100)>0){//check if x2 is larger than 100 99-100 >0 false
      System.out.println();
    }
    if (x2.compareTo(100)<0){ //check if x2 is smaller than 100
    }
    if (x2.equals(100)){ // check if x2 equals to 100

    }
    if (!x2.equals(100)){ //check x2 not equals to 100}
    }

    long l1 = 100L;
    Long l2 = 100L;

    float f1 = 9.0f;
    Float f2 = 9.0f;

    double d1 = 100.99;
    Double d2 = 100.99;

    char ch1 = 'c';
    Character ch2 = 'c';
    if (ch2.equals('c')){
      System.out.println("equals");
    }
    if (ch2.compareTo('c') > 0){
      System.out.println("ASCII left > right");
    }

    boolean o1 = true;
    Boolean o2 = true;


    //Internal Cache
    Integer k1 = 127;
    Integer k2 = 127;
    System.out.println(k1.equals(k2));//true
    System.out.println(k1 == k2); // true

    Integer k3 = 128;// create a new object, coz not in the range of common use 
    Integer k4 = 128; // create a new object, coz not in the range of common use 
    System.out.println(k3.equals(k4));//true
    System.out.println(k3 == k4); // false 

    //! =128 to 127 (Java Define a range of common use number)
    // Integer(Class/ Object) -> comparsion -> compareTo, equals 



    //Implicit promotiom
    float f10 = 1000L;
    double d10 = 10.9f;
    float f12 =19;
    byte b10 =127;
    double d11 = b10; //assign byte calue into double variable 
    int x10 = 'a';
    double d12 = 'a';//ok 97.0

    //auto-box(long->Long)
    Long l30 = 100L;
    Integer i30 = 100;
    Character ch30 = 'x';

    // Wrapper class vs primitivies (auto box / un-box)
    // un box (Long -> long)
    long l31 = 130;
    int i31 = i30;
    char ch31 = ch30;
    

    //long l20 = 100; //int -> long
    // Java not alowed to convert implication promotion and auto-box at the same time
    //Long l21 = 100; // int -> long -> long 
    // Double d100 = d10; // int -> double ->Double

    // Unsafe down casting (Java disallow)
    //int x11 = d12; // risky
   // int x11 = (int) d12 // take rsik - overflow
    //System.out.println(x11); // 97
  }
  
}
