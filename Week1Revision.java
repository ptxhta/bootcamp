public class Week1Revision {
  public static void main(String[] args) {
    System.out.println("hello");
    // 8 Primitives + String
    byte b1 = 5; //-128 to 127
    short s1 = 30000; // -3xxxx to 3xxxx
    int i1 = 2_100_000_000; // +-21億
    // 2_200_000_000 -> invalid int value
    long l1 = 21_000_000_000L; 

    double d1 = 10.99;   // 10.99 is double value
    float f1 = 10.99f; 

    boolean isSomething = true; // True / Fasle

    char ch1 = 'a'; //97 -> ascii, 0-60k character 

    // Math (+ - * /)
    // Overflow 
    // Down Casting i.e. int -> byte
    // divide 0 
    // double + double (0.1 +0.2)
    
    int number = 2_100_000_000;
    long number2 = number + 100_000_000L; 
    System.out.println(number2);
    // this example solve the overflow problems (byte, short, int, long)
    // int + int -> overflow 

    //Down cast 
    // byte + byte -> int + int -> int 
    // short + short -> int + int -> int
    // byte + short -> int + int -> int
    byte by1 = 100;
    short sh = 100;
    short sh2 = (short) (by1 + sh);

    // doublle + double -> double 
    System.out.println(0.1+0.1);
    
    // String 
    String str1 = "hello";
    // length() return int
    System.out.println(str1.length());
    //charAT() return string
    System.out.println(str1.charAt(0));
    System.out.println(str1.charAt(str1.length()-1));
    String str2 = "hello";
    //equals (return boolean)
    System.out.println(str1.equals(str2));

    //IndexOf (return int)
    System.out.println(str1.indexOf('o'));
    System.out.println(str1.indexOf("ll"));
    // contains (return boolean)
    System.out.println(str1.contains("ll"));
    // substring (endIndex - 1)(return String)
    System.out.println(str1.substring(0, 3));// hel
    //replace (return String)
    System.out.println(str1.replace("ll", "xxx"));// hexxxo
    // startsWith (return boolean)
    System.out.println(str1.startsWith("he")); // true
    //endsWith (return boolean)
    System.out.println(str1.endsWith("lllo"));// False
    // equalsIgnoreCase (return boolean)
    System.out.println("Hello".equalsIgnoreCase(str1));//True
    // compareTo ( return int) ASCII
    System.out.println("abc".compareTo("ggg"));// a-g = -6 
    // Trim (return string)
    System.out.println(" hello world. ".trim()); // "hello world."
    //isEmpty ( return boolena)
    System.out.println("abc".isEmpty()); // False
    System.out.println("".isEmpty()); // 不定variable  True
    System.out.println(" ".isEmpty()); // False
    //isBlank (return boolean)
    System.out.println("abc".isBlank()); // 
    System.out.println("".isBlank()); // 不定variable  True
    System.out.println(" ".isBlank());
    // lastIndexOf (return int)
    System.out.println("Heowoop".lastIndexOf("0"));
    // concat (return String)
    System.out.println("Hot".concat("dog"));
    // toLowercase toUppercase (return string)
    System.out.println("HELLO".toLowerCase());
    System.out.println("apple".toUpperCase());

    // ASCII
    char ch2 = 'a';
    // char + int -> int
    int ascii = ch2 + 1;
    System.out.println(ascii); //98

    int ascii2 = ch2 + 70000;
    System.out.println(ascii2);
    
    // char + int -> int
    //you take risk down cast -> overflow
    char ch3 = (char)(ch2 + 65535 + 1); // range 0 - 65535
    System.out.println(ch3);

    //Operator 
    // Math: + - * / % ++ --  += -= *= /=
    int h = 3;
    h++;
    ++h;
    int a = 10;
    System.out.println(++a + a++ *3);// 11 + (33) =44 // a =12
    a++;//a =11
    a = a + a *3; // 44
    // Comparsion >,<,>=,<=,==, !=
    // Primitives Comparsion >,<,>=,<=,==, !=
    int age =19;
    boolean isAdult = age >=18;
    if (!isAdult){ // isAdlt = False
      System.out.println("He is not an adult.");
    }
    // String comparsion (method)to do
    String s10 = "Hello";
    String s11 = new String("Hello");
    System.out.println(s10 == s11);// False
    System.out.println(s10.equals(s11));//True

    //If + Switch (Condition)
    //!else if -> if u are beginner, strongly recommend not to write complicated condition in "else if"
    double price = 99.99;
    int quantity = 10;
    // below 500, discount 5% off
    // amount >= 500, discount 10% off
    // amount >= 1000, discount 20% off
    double amount = price * quantity; 
    if (amount >=1000){
      amount = amount * 0.8;
    } else if (amount >= 500){
      amount *= 0.9;
    } else {
      amount = amount * 0.95;
    }

    // Switch 
    // add break
    // check single value only ( not to range checking)
    char grade = 'B';
    switch (grade){
      case 'A':
        System.out.println("Grade =A");
        break;
      case 'B':
        System.out.println("Grade =B");
        break;
        default:
          System.out.println("failed");
    }


    // For loop
    for (int i = 0; i < 3; ++i){
      System.out.println("hello");
    }
    String s = "hello";
    for (int i = 0; i< s.length(); ++i){
      System.out.println(s.charAt(i));
    }

    //Seaching
    // hlo
    //el
    String t1 = "";
    String t2 = "";
    for (int i = 0; i<s.length(); ++i){
      if (i % 2 == 0){
        t1 += s.charAt(i);
      } else{
        t2 += s.charAt(i);
      }
    }
    System.out.println(t1);
    System.out.println(t2);

    // Counting -> target 
    // how many 'l' in the string
    int countl = 0;
    for (int i = 0; i<s.length(); i++){
      if (s.charAt(i)== 'l'){
        countl++;
      }
    }
    System.out.println(countl);

    //Name Conversion
    boolean isAdult1 = false;
    int studentsAge = 14;

  }
}
