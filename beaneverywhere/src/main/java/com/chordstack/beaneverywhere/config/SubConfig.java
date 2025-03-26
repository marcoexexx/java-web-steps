package com.chordstack.beaneverywhere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.chordstack.beaneverywhere.WhatIsScopeBean;

@Configuration
public class SubConfig {
  @Bean
  public String firstName() {
    return "Thor";
  }

  @Bean
  public String lastName() {
    return "Odinson";
  }

  @Bean
  @Scope(value = "prototype")
  public WhatIsScopeBean whatIsScope() {
    WhatIsScopeBean instance = new WhatIsScopeBean();

    instance.setData("set bean data");

    return instance;
  }
}
