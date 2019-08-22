package com.fnx.java11news;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.fnx.java11news.interfaces.IFilesNews;
import com.fnx.java11news.interfaces.IStringNews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class FilesNewsTests {

  @Autowired
  private IFilesNews files;

  private final String pathFile = "E://Programacion//Java//java11Tests//jdk11FilesTests.txt";

  @Test
  public void createFile_shouldReturnSamePath() {
    String expectedPath = files.createFile(pathFile);
    assertEquals(expectedPath, Path.of(pathFile).toString());
  }

  @Test
  public void readFile_WhenTextIsEmpty_shouldReturnDefaultText() {
    String expectedContent = "New files created simply by JDK11";
    String fileContent = files.readFile(pathFile);
    assertEquals(expectedContent, fileContent);
  }

}
