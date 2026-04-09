//Class
public class Person {
  // Attributes
  private String name;
  private double height; //m
  private double weight; //kg


  public boolean isOverWeight(){
    if (this.weight >100){
    return true;
    } 
    return false;
  }

  public String bmiGroup(){
    double bmi = this.bmi();
    if(this.bmi()>25){
      return "overweight";
    } else if (this.bmi() < 18.5){
      return "underweight";
    }
    return "normal";
  }

  //Method -> Presentation (APIE: Encapsulation)
 

  // Instance Method (Object Method)
  public String getName(){
    return this.name;
  } 
  // Instance Method (Object Method)
  public double getHeight(){
    return this.height;
  } 
  // Instance Method (Object Method)
  public double getWeight(){
    return this.weight;
  } 

  // Instance Method (Object Method)
  // void = return nothing
  public void setName (String name){
    this.name = name;
  }
  // Instance Method (Object Method)
  public void setHeight (double height){
    this.height = height;
  }
  // Instance Method (Object Method)
  public void setWeight (double weight){
    this.weight = weight;
  }
  
  //BMI -> weight / height^2
  public double bmi(){
    return this.weight/(this.height * this.height);
  }
  
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("John");
    p1.setHeight(1.76);
    p1.setWeight(75);

    System.out.println(p1.getName() + " " + p1.getHeight() + " " + p1.getWeight());


  }
    
  


}
