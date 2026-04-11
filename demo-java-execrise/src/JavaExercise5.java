public class JavaExercise5 {
  // Sum values of an array
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    boolean found = false; 
    for (int i = 0; i < str.length(); i++){
      if(str.charAt(i) == target){
        found = true;
        break;
      }
    }
    if (found) {
      System.out.println("Found");
    } else{
      System.out.println("Not Found");
    }

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
  }
}
