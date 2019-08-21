package com.fnx.java11news;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fnx.java11news.interfaces.IStringNews;

import org.springframework.stereotype.Component;

@Component
public class StringNews implements IStringNews {

  @Override
  public boolean checkEmptyText(String text) {
    return text.isEmpty();
  }

  @Override
  public List<String> castTextToList(String text) {
    Stream<String> lines = text.lines();
    List<String> list = lines.collect(Collectors.toList());
    return list;
  }

}
