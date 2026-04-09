public class DemoStringII {
  public static void main(String[] args) {
    // "hello" -> JVM create object in sring pool
    String s1 = "hello";//product string object
    String s2 = "hello";//product string object
    System.out.println(s1.equals(s2));//true

    //String is a class
    // new -> produce Object (Force)
    int[] arr = new int[3];
    Person p1 = new Person(); //product array object
    String s3 = new String("hello");//product person object
    String s4 = new String("hello");//product string object
    // Dont use == for commparsion forever
    // For class object (non-primitive) always use equals for comparsion
    
    // == check if they are in same address (same object)
    System.out.println(s1 == s2); //true
    System.out.println(s4 == s3); //false
    System.out.println(s1 == s3); //false
    System.out.println(s2 == s4); //false

    //equals check if they are with same String value
    if (s1.equals(s4)){
      System.out.println("hello");
    } 
    //All primitivies still use   == for comparsion 
    int x =3;
    if (x ==3){
    }

    Person p2 = new Person();
    Person p3 = new Person();
    System.out.println(p2 == p3);//false
    System.out.println(p2.equals(p3));//false
  }
  
}
