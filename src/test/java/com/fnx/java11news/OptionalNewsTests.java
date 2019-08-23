package com.fnx.java11news;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.fnx.java11news.interfaces.IOptionalNews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class OptionalNewsTests {

  @Autowired
  private IOptionalNews optional;
  @Autowired
  private Person springPerson;

  @Test
  public void isEmpty_whenPersonIsNull_shouldReturnTrue() {
    Person fakePerson = null;
    assertTrue(optional.isEmpty(fakePerson));
  }

  @Test
  public void isEmpty_whenPersonIsValidInstance_shouldReturnFalse() {
    assertFalse(optional.isEmpty(springPerson));
  }
}
