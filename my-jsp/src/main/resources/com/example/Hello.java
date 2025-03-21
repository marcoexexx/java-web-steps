package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloi")
public class Hello extends HttpServlet {
  @Override
  public void init() throws ServletException {
    System.out.println("\n\n[ INIT ] SERVER HAVE BEEN INITIALIZED.");
  }

  @Override
  public void destroy() {
    System.out.println("\n\n[ DESTROY ] SERVER HAVE BEEN DESTROYED.");
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain");

    response.getWriter().println("Rusty");
  }
}
