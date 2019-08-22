package com.fnx.java11news;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import com.fnx.java11news.interfaces.IFilesNews;

import org.springframework.stereotype.Component;

@Component
public class FilesNews implements IFilesNews {

  @Override
  public String readFile(String filePath) {
    String content = null;
    try {
      content = Files.readString(Path.of(filePath));
    } catch (Exception e) {
      e.printStackTrace();
    }
    return content;
  }

  @Override
  public String createFile(String filePath) {
    return this.createFile(filePath, "New files created simply by JDK11");
  }

  @Override
  public String createFile(String filePath, String text) {
    String stringPath = null;
    try {
      Path path = Files.writeString(Path.of(filePath), text, StandardOpenOption.CREATE_NEW);
      stringPath = path.toString();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return stringPath;
  }
}
