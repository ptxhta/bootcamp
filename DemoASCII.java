public class DemoASCII {
  public static void main(String[] args) {
    // char (0-60k) --> int (21xxx)
    char c1 = 'a';

    // auto conversion (promotion)
    int asciiValue = 'a';
    System.out.println(asciiValue);

    char c2 = '8';
    int asciiValue2 = '8';
    System.out.println(asciiValue2);

    int asciiValue3 = 'C';
    System.out.println(asciiValue3);

    int ascii4 = '尸';
    System.out.println(ascii4);

    int ascii5 = ',';
    System.out.println(ascii5);

    // how to convert back to char value never int --> char
    int ascii6 = 97;
    // char c2 = ascii6 ;  too risky coz int is bigger than charr, not possible to move in small

    byte b1 = 100;
    byte b2 = 110;
    // ! byte + byte --> int
    int i2 = b1 + b2;
    System.out.println(i2);

    short s1 = 20000;
    short s2 = 20000;
    // ! short + short -> int + int
    int i3 = s1 + s2;
    System.out.println(i3);

    double d1 = 999.99;
    // float f1 = d1; // risky

    float f2 = 999.99f;
    double d2 = f2; //ok
    System.out.println(d2);




  }
  
}
