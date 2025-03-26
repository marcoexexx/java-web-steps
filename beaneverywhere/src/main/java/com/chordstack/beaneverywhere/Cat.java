package com.chordstack.beaneverywhere;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Cat {
  private String name;
  private int age;
  private String render;

  public Cat() {
    System.out.println("Call Cat constructor");
  }

  public String getRender() {
    return render;
  }

  public void setRender(String render) {
    this.render = render;
  }

  @PostConstruct
  public void startup() {
    System.out.println("CREATED BESN FORT CAT");
  }

  @PreDestroy
  public void di() {
    System.out.println("PreDestroy BESN FORT CAT");
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
}
