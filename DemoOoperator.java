public class DemoOoperator {
  public static void main(String[] args) {
    // + = * /

    // % (Find Reminder)
    int remainder = 5 % 2;
    System.out.println(remainder);//1

    System.out.println(5 % 6); //5

    // ++ -- 
    // += -= *= /=
    int a = 10;
    a = a + 1;
    a++;
    ++a;
    a += 1;
    System.out.println(a); //14

    int b = 20;
    b -= 1;
    b = b - 1;
    b--;
    --b;
    System.out.println(b);

    // + 2
    int c = 10;
    c = c + 2;
    c += 2;

    int salary = 25000;
    salary *= 3;
    System.out.println(salary);

    // Naming Convension Caml Case
    double hourRate = 40.5;
    int hoursPerDay = 7;
    double todaySalary = hourRate * hoursPerDay;
    System.out.println(todaySalary);
    
  }
}
