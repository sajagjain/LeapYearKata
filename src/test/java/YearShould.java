import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearShould {
  @Test
  void be_divisible_by_400() {
    Year year = new Year(2000);
    assertTrue(year.isLeapYear());
  }

  @Test
  void not_be_divisible_by_100_and_divisible_by_400() {
    Year year = new Year(2100);
    assertFalse(year.isLeapYear());
  }

  @ParameterizedTest
  @CsvSource({"2008", "2012", "2016"})
  void not_be_divisible_by_100_and_be_divisible_by_4(int inputYear) {
    Year year = new Year(inputYear);
    assertTrue(year.isLeapYear());
  }
}
