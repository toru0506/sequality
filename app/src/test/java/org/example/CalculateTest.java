package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.01);
  }

  @Test
  public void testSumRepetition() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumRepetition(1, 10));
  }

  @Test
  public void testSumOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumOdd(expected, calculate.sumOdd(1, 10)));
  }

  @Test
  public void testSumEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumEven(expected, calculate.sumEven(1, 10)));
  }
}
