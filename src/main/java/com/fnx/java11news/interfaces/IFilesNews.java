package com.fnx.java11news.interfaces;

public interface IFilesNews {

  public String readFile(String pathFile);

  public String createFile(String filePath);

  public String createFile(String filePath, String text);

}
