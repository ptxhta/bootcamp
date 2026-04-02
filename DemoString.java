public class DemoString {
  public static void main(String[] args) {

    // String is not Primitive, but a class
    // Class has method

    // Print String value
    System.out.println("hello");

    // "" -> define String value
    // String value can be any length 
    String s1 = "h";
    char c1 = 'h';

    // String support + operation 
    s1 = s1 + "!!!";
    System.out.println(s1); //h!!!

    // String has methods (function)
    // 1. length() -> return int value
    System.out.println(s1.length());//4
    System.out.println(s1); //h!!!

    // 2. charAt() -> return 
    String s2 = "hello";
    //Find the third character in s2

    // Java index: start with 0 -->length -1
    // "hello" -> 0 (h), 4(o)
    System.out.println(s2.charAt(2));//2

    // Find the last character 
    // length()-> 
    System.out.println(s2.charAt(s2.length()-1));

    int stringLength = s2.length();
    int lastIndex = stringLength - 1;
    System.out.println(s2.charAt(lastIndex));

    // 3. equals()-> return boolean
    String s3 = "hello";
    System.out.println(s2.equals(s3));// True

    String s4 = "Hello";
    System.out.println(s2.equals(s4));// False


 //4. isEmpty()
    String s5 = ""; // empty value
    System.out.println(s5.isEmpty());// True
    System.out.println(s4.isEmpty()); //False
    if (s5.isEmpty()){

    }

   //5. isBlank()
   String s6 = " ";
   System.out.println(s6.isEmpty()); //False
   System.out.println(s6.isBlank()); //True

   //6. toLowerCase / toUpperCase
   String lowercase = s4.toLowerCase();
   String uppercase = s4.toUpperCase();
   System.out.println(s4);
   System.out.println(lowercase);
   System.out.println(uppercase);
  
   //7. contains()
    if (s4.contains("lll")){
      System.out.println("contains ll");
    } else{
      System.out.println("does not contain lll");
    }

    //8. starts with / ends with 
    if (s4.startsWith("He")){
      System.out.println("Starts with He");
    }
    if (s4.endsWith("llo")){
      System.out.println("Ends with llo");
    }

    // 9. replace -> String
    String s10 = "Bootcamp";
    String s11 = s10.replace('o', 'x');
    System.out.println(s11);//"Bxxtcamp"

    String s12 = s10.replace("camp", "");
    System.out.println(s12); //Boot

    // 10. substring(startIndex, endIndex)
    String s13 = "hello";
    String ss = s13.substring(2, 4);
    System.out.println(ss);// ll, because startIndex = 2, endIndex -1 = 3

    System.out.println(s13.substring(1));// ello

    // 11. IndexOf - return Index
    String s14 = "Bootcamp";
    System.out.println(s14.indexOf('o')); // 1
    System.out.println(s14.indexOf("camp"));//4
    System.out.println(s14.indexOf("jave")); //-1
    System.out.println(s14.indexOf("CAMP"));//-1
    System.out.println(s14.indexOf(97));//5 

    // 12. LastIndexOf 
    String s15 = "Booto";
    System.out.println(s15.lastIndexOf('o')); //o 
    System.out.println(s15.lastIndexOf("oo")); //1

    // 13. trim () remove the leading space and tail space
    String s16 = " hello world ";
    String afterTrim = s16.trim();
    System.out.println(afterTrim); // "hello world"
    System.out.println(s15.replace(" ", ""));

    // 14. concat
    String s17 = "hello";
    String s18 = "world";
    // String + String -> String
    System.out.println(s17 + s18); // helloworld

    String combinedString = s17.concat(s18);
    System.out.println(combinedString); // hellowrold

    // 15. compareTo ASCII compare first character compare
    String s19 = "abc";
    String s20 = "def";
    System.out.println(s19.compareTo(s20));// -3 ('a'-'d')

    if (s19.compareTo(s20)>0){
      System.out.println("s18 ASCII >s19 ASCII");
    } else {
      System.out.println("s19 ASCII > s18 ASCII");
    }

    // 16. equalsIgnoreCase()
    String s21 = "John Lau";
    String s22 = "JOHN LAU";

    if (s21.equalsIgnoreCase(s22)){
      System.out.println("The names are same");
    }


  }
}
