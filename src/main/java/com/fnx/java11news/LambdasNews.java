package com.fnx.java11news;

import java.util.stream.IntStream;

import com.fnx.java11news.interfaces.ILambdasNews;

import org.springframework.stereotype.Component;

@Component
public class LambdasNews {

  public void filter(String option) {
    switch (option) {
    case "pair":
      IntStream.of(1, 2, 3, 4, 5, 6, 7).filter((var i) -> i % 2 == 0).forEach(System.out::println);
      break;

    case "odd":
      IntStream.of(1, 2, 3, 4, 5, 6, 7).filter((var i) -> i % 2 != 0).forEach(System.out::println);
      break;
    }
  }

  public double operation() {
    ILambdasNews operation = (var x, var y) -> (x + y);
    double result = operation.sum(2, 2.5);
    return result;
  }

}
