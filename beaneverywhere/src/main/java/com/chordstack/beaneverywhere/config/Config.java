package com.chordstack.beaneverywhere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chordstack.beaneverywhere.Cat;

@Configuration
public class Config {
  @Bean
  public Cat tommyCat() {
    Cat cat = new Cat();

    cat.setName("Tom");
    cat.setAge(5);
    cat.setRender("cat");

    return cat;
  }
}
