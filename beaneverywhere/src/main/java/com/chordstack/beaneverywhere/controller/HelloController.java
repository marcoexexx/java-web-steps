package com.chordstack.beaneverywhere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chordstack.beaneverywhere.Cat;
import com.chordstack.beaneverywhere.WhatIsScopeBean;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
  private final Cat cat;
  @Qualifier("firstName")
  private final String firstName;
  @Qualifier("lastName")
  private final String lastName;
  private final WhatIsScopeBean wtfScope;

  @Autowired
  public HelloController(Cat cat, String firstName, WhatIsScopeBean wtfScope, String lastName) {
    this.cat = cat;
    this.firstName = firstName;
    this.wtfScope = wtfScope;
    this.lastName = lastName;
  }

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String render(Model model, HttpServletRequest req) {

    model.addAttribute("name", this.cat.getName());
    model.addAttribute("age", this.cat.getAge());

    System.out.println("->> " + req.getMethod());
    System.out.println("->> " + this.firstName + " " + this.lastName);
    System.out.println("->> " + this.wtfScope.getData());

    return this.cat.getRender();
  }
}
