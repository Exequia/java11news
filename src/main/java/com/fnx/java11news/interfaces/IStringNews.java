package com.fnx.java11news.interfaces;

import java.util.List;

public interface IStringNews {

  public boolean checkEmptyText(String text);

  public List<String> castTextToList(String text);

  public String stripText(String text);

  public String stripLeadingText(String text);

  public String stripTrailingText(String text);
}
