<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <title>JSP | Compound Interest</title>
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
  </head>

  <body>
    <% String error = (String) request.getAttribute("error"); %>
    <% Double result = (Double) request.getAttribute("result"); %>
    <% String principalAmount = (String) request.getAttribute("principalAmount"); %>
    <% String interestPercentage = (String) request.getAttribute("interestPercentage"); %>
    <% String years = (String) request.getAttribute("years"); %>
    <% String compoundingPeriod = (String) request.getAttribute("compoundingPeriod"); %>

    <form action="calculate" method="post" class="max-w-lg mx-auto p-6 bg-white rounded-lg shadow-lg">
      <h2 class="text-2xl font-semibold text-center mb-6">Loan Calculator</h2>

      <div class="mb-4">
        <label for="principal-amount" class="block text-sm font-medium text-gray-700">Principal Amount:</label>
        <input id="principal-amount" type="number" name="principal-amount" value="<%= principalAmount %>" 
               class="mt-1 block w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
      </div>

      <div class="mb-4">
        <label for="interest" class="block text-sm font-medium text-gray-700">Interest Percentage:</label>
        <input id="interest" type="number" name="interest" min="1" max="100" value="<%= interestPercentage %>"
               class="mt-1 block w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
      </div>

      <div class="mb-4">
        <label for="years" class="block text-sm font-medium text-gray-700"># of Years:</label>
        <input id="years" type="number" name="years" min="1" value="<%= years %>"
               class="mt-1 block w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
      </div>

      <div class="mb-4">
        <label for="compoundingperiod" class="block text-sm font-medium text-gray-700">Times per Year:</label>
        <input id="compoundingperiod" type="number" name="compoundingperiod" min="1" max="12" value="<%= compoundingPeriod %>"
               class="mt-1 block w-full px-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
      </div>

      <button type="submit" class="w-full mt-4 py-2 bg-blue-500 text-white font-semibold rounded-lg hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-400">
        Calculate
      </button>
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
