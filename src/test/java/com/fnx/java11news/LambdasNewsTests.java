package com.fnx.java11news;

import static org.junit.Assert.*;

import com.fnx.java11news.interfaces.ILambdasNews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class LambdasNewsTests {

  @Autowired
  private ILambdasNews lam;

  // @Test
  // public void checkEmptyText_whenTextIsEmpty_shouldReturnTrue() {
  // String text = "";
  // assertTrue(str.checkEmptyText(text));
  // }
}
