import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    // Java 8 + -> localDate
    // LocalDate -> can not be "new"
    LocalDate ld1 = LocalDate.of(2024, 12, 31);
    System.out.println(ld1);// 2024 -12-31

    System.out.println(ld1.getMonthValue());
    System.out.println(ld1.getDayOfWeek());
    System.out.println(ld1.getYear());

    LocalDate today = LocalDate.now();
    System.out.println(today.getDayOfWeek());

    // + -
    LocalDate joinDate = LocalDate.now();
    LocalDate probationEndDate = joinDate.plusMonths(3L);
    System.out.println(probationEndDate);

    LocalDate firstDayOfYear = LocalDate.of(2026, 1, 1);
    LocalDate yearEnd = firstDayOfYear.minusDays(1L);
    System.out.println(yearEnd);

    Month month = joinDate.getMonth();
    System.out.println(month);

    //comparsion --isBefore
    if (probationEndDate.isBefore(LocalDate.of(2026, 7, 10))){
      System.out.println("yes, before 2026 - 07-10");
    }

    // isAfter 
    if (probationEndDate.isAfter(LocalDate.of(2026, 7, 1))){
      System.out.println("yes, after 2026 - 07-1");
    }

    // equals
    if (probationEndDate.equals(LocalDate.of(2026, 7, 9))){
      System.out.println("yes, after 2026 - 07-9");
    }
    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear()); //false
    System.out.println(LocalDate.of(2004, 1, 1).isLeapYear());// true

    System.out.println(joinDate.isLeapYear()); //false
  }
  
}
