package com.chordstack.beaneverywhere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chordstack.beaneverywhere.Cat;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
  private final Cat cat;
  private final String strBean;

  @Autowired
  public HelloController(Cat cat, String strBean) {
    this.cat = cat;
    this.strBean = strBean;
  }

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String render(Model model, HttpServletRequest req) {

    model.addAttribute("name", this.cat.getName());
    model.addAttribute("age", this.cat.getAge());

    System.out.println("->> " + strBean);
    System.out.println("->> " + req.getMethod());

    return this.cat.getRender();
  }
}
