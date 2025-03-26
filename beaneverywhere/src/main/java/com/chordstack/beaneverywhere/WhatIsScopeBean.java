package com.chordstack.beaneverywhere;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class WhatIsScopeBean {
  private String data;

  public void setData(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }

  @PostConstruct
  public void init() {
    System.out.println();
    System.out.println("WhatIsScopeBean `bean` is create");
  }

  @PreDestroy
  public void destroy() {
    System.out.println();
    System.out.println("WhatIsScopeBean `bean` is destroyed");
  }
}
