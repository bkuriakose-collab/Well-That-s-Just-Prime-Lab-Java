package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals(expected, factorizer.primeFactors(0));
  }


  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals(expected, factorizer.primeFactors(1));
  }


  @Test
  void itReturnsFactorsForNine() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(3);
    expected.add(3);
    assertEquals(expected, factorizer.primeFactors(9));
  }


  @Test
  void itReturnsFactorsForTen() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(5);
    assertEquals(expected, factorizer.primeFactors(10));
  }


  @Test
  void itReturnsFactorsForOneHundred() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(2);
    expected.add(5);
    expected.add(5);
    assertEquals(expected, factorizer.primeFactors(100));
  }
}