package com.marco.compound_interest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
  @Override
  public void init() throws ServletException {
    super.init();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/calculate.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String principalAmount = req.getParameter("principal-amount");
    String interestPercentage = req.getParameter("interest");
    String years = req.getParameter("years");
    String compoundingPeriod = req.getParameter("compoundingperiod");

    String error;

    if (principalAmount == null || interestPercentage == null || years == null || compoundingPeriod == null
        || principalAmount.isBlank() || interestPercentage.isBlank() || years.isBlank()
        || compoundingPeriod.isBlank()) {
      error = "One of more of input were blank. Try again.";

      req.setAttribute("error", error);
    } else {
      double result = Utils.calculateCompoundInterest(
          Double.parseDouble(principalAmount),
          Double.parseDouble(interestPercentage) / 100,
          Integer.parseInt(years),
          Integer.parseInt(compoundingPeriod));

      req.setAttribute("result", result);

      req.setAttribute("principalAmount", principalAmount);
      req.setAttribute("interestPercentage", interestPercentage);
      req.setAttribute("years", years);
      req.setAttribute("compoundingPeriod", compoundingPeriod);
    }

    getServletContext()
        .getRequestDispatcher("/calculate.jsp")
        .forward(req, resp);
  }
}
