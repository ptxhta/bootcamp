public class DemoClassObject {
  public static void main(String[] args) {
    //Primitives, String, Array, if , loop


    // Tutor Phone number
    //Tutor Email Address
    // Tutor Wechat
    // Tutor Whatsapp

    String phoneNumber = "+852 12345678";
    String emailAddress = "vincentlau@gmail.com";
    String weChatId = "vincentlau";
    String whatsappNumber = "+852 1234567";

    String[] tutor = new String [] {"+852 12345678", "vincentlau@gmail.com", "vincentlau", "+852 1234567"};
    //Disadvantage  -> read data from development perspective 
    System.out.println(tutor[1]); // Have to remember array location for special data 
    
    //Object-oriented Programming
    Tutor t1 = new Tutor(); // Produce Tutor Object
    // t1 --> Big Box
    t1.setEmailAddress("sallychan@gmail.com"); 
    
    // t1 . = call () sub this into setemail address
    Tutor t2 = new Tutor();
    t2.setEmailAddress("leolau@gmail.com");
    String t2Email = t2.getEmailAddress();
    System.out.println(t2Email);//"leolau@gmail.com"

    System.out.println(t1.getEmailAddress());//sallychan@gmail.com

    // car
    car c1 = new car();
    c1.setBrand("tesla");
    c1.setColor("RED");
    c1.setYear(2023);
    System.out.println(c1.getYear());//2023

    car c2 = new car();
    c2.setBrand("BYD");
    c2.setColor("WHITE");
    c2.setYear(2021);
    System.out.println(c2.getColor());//WHITE


  }
}
