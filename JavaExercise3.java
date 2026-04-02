public class JavaExercise3 {
  public static void main(String[] args) {
    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant (anothor 21 letters)
    // 3. Not an alphabet
    char ch = 'i';
    char lowerCh = Character.toLowerCase(ch);

    if (lowerCh >= 'a' && lowerCh <= 'z') { // 第一層：檢查係咪英文字母
    if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
        System.out.println(ch + " is a vowel");
    } else {
        System.out.println(ch + " is consonant");
    } 
    } else { 
      System.out.println(ch + " is not an alphabet");
    }

    // Take salary and years of experience, then calculate and print bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    int exp = 12;
    int salary = 110_000;
    double bonus; 
    if (exp >= 10){
      bonus = 0.2 * salary; 
    } else if (exp >=5 && exp <= 9){
      bonus = 0.1 * salary; 
    } else{
      bonus = 0.05 * salary;
    }
    System.out.println("Your bonus is " + bonus);
  }
}
