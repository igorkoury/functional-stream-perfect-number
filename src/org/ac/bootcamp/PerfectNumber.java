package org.ac.bootcamp;

import java.util.stream.IntStream;

public class PerfectNumber {


   public static void main(String[] args) {

      PerfectNumber perfectNumber = new PerfectNumber();

      perfectNumber.sumDivisor(1000);
      perfectNumber.checkPerfect(1, 1000);

   }


   public int sumDivisor(int number) {

      return IntStream.range(1, number)
              .filter(predicate -> number % predicate == 0)
              //.peek(System.out::println)
              .sum();
              //.reduce(0, Integer::sum);
   }

   public void checkPerfect(int min, int max) {

      IntStream.range(min, max)
              .filter(number -> number == sumDivisor(number))
              .parallel()
              .forEach(System.out::println);
   }
}
