package com.fnx.java11news;

import com.fnx.java11news.interfaces.IStringNews;

import org.springframework.stereotype.Component;

@Component
public class StringNews implements IStringNews {

  @Override
  public boolean checkEmptyText(String text) {
    return text.isEmpty();
  }

}
