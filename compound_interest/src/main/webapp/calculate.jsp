<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <title>JSP | Compound Interest</title>
  </head>

  <body>
    <% String error = (String) request.getAttribute("error"); %>
    <% Double result = (Double) request.getAttribute("result"); %>
    <% String principalAmount = (String) request.getAttribute("principalAmount"); %>
    <% String interestPercentage = (String) request.getAttribute("interestPercentage"); %>
    <% String years = (String) request.getAttribute("years"); %>
    <% String compoundingPeriod = (String) request.getAttribute("compoundingPeriod"); %>

      <form action="calculate" method="post">
        <label for="principal-amount">Principal Amount:</label>
        <input id="principal-amount" type="number" name="principal-amount" value="<%= principalAmount %>">

        <label for="interest">Interest Percentage:</label>
        <input id="interest" type="number" name="interest" min="1" max="100" value="<%= interestPercentage %>">

        <label for="years"># of Years:</label>
        <input id="years" type="number" name="years" min="1" value="<%= years %>">

        <label for="compoundingperiod">Times per Year:</label>
        <input id="compoundingperiod" type="number" name="compoundingperiod" min="1" max="12" value="<%= compoundingPeriod %>">

        <button type="submit">Calculate</button>
      </form>

      <% if (error != null) { %>
      <span>Error: <% out.println(error); %><span/>
      <% } else { %>
      <% if (result != null) { %>
      <p>Result: <% out.println(result.doubleValue()); %><p/>
      <% } else { %>
      <p>Result: 0.0<p/>
      <% } %>
      <% } %>
  </body>

  </html>
