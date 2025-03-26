package com.chordstack.beaneverywhere;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeaneverywhereApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(BeaneverywhereApplication.class, args);

    for (@SuppressWarnings("unused")
    String name : ctx.getBeanDefinitionNames()) {
      // System.out.println(name);
    }
  }
}
