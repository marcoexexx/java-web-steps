package com.chordstack.beaneverywhere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubConfig {
  @Bean
  public String name() {
    return "hello.html";
  }
}
