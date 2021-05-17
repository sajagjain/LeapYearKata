public class Year {
  private final int year;

  public Year(int year) {
    this.year = year;
  }

  public boolean isLeapYear() {
    return this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0);
  }
}
