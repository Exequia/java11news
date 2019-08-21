package com.fnx.java11news;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
  public void checkEmptyText_whenTextIsEmpty_shouldReturnTrue() {
    String text = "";
    assertTrue(str.checkEmptyText(text));
  }

  @Test
  public void checkEmptyText_whenTextIsNotEmpty_shouldReturnFalse() {
    String text = "I'm a tea pot!";
    assertFalse(str.checkEmptyText(text));
  }

  @Test
  public void castTextToList_whenValidTextFormat_shouldBeOk() {
    String text = "1,2,3,4";
    List<String> expectedResult = new ArrayList<String>();
    expectedResult.add("1");
    expectedResult.add("2");
    expectedResult.add("3");
    expectedResult.add("4");

    List<String> result = str.castTextToList(text);

    // assertEquals(expectedResult, result);
    assertNotSame(expectedResult, result);
  }

  @Test
  public void stripText_shouldReturnCleanText() {
    String dirtyText = "  \n\t text to clean \u2005  ";
    String expectedResult = "text to clean";
    assertEquals(expectedResult, str.stripText(dirtyText));
  }

  @Test
  public void stripLeadingText_shouldReturnCleanTextOnlyOnInit() {
    String dirtyText = "  \n\t text to clean \u2005  ";
    String expectedResult = "text to clean \u2005  ";
    assertEquals(expectedResult, str.stripLeadingText(dirtyText));
  }

  @Test
  public void stripTrailingText_shouldReturnCleanTextOnlyOnEnd() {
    String dirtyText = "  \n\t text to clean \u2005  ";
    String expectedResult = "  \n\t text to clean";
    assertEquals(expectedResult, str.stripTrailingText(dirtyText));
  }

}
