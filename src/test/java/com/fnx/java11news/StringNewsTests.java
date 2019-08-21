package com.fnx.java11news;

import static org.junit.Assert.*;

import com.fnx.java11news.interfaces.IStringNews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class StringNewsTests {

  @Autowired
  private IStringNews str;

  @Test
  public void whenTextIsEmpty_shouldReturnTrue() {
    String text = "";
    assertTrue(str.checkEmptyText(text));
  }

  @Test
  public void whenTextIsNotEmpty_shouldReturnFalse() {
    String text = "I'm a tea pot!";
    assertFalse(str.checkEmptyText(text));
  }

}
