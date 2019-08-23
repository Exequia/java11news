package com.fnx.java11news;

import java.util.Optional;

import com.fnx.java11news.interfaces.IOptionalNews;

import org.springframework.stereotype.Component;

@Component
public class OptionalNews implements IOptionalNews {

  @Override
  public boolean isEmpty(Person person) {
    Optional<Person> optional = Optional.ofNullable(person);
    return optional.isEmpty();
  }
}
