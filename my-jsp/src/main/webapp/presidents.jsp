<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <title>Presidents</title>

  <style>
  </style>

  <body>
    <div class="group">

      <% out.println(request.getAttribute("error")); %>

      <hr />

      <% String x = "hello"; %>

      <% out.println(x); %>

      <p>Name: <% out.println(request.getAttribute("name")); %>
    </div>
  </body>
</html>
