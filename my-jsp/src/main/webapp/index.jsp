<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="com.example.Joke" %>

<html>
  <body>
    <h2>Hello World!</h2>
    <% out.println(new Joke().data()); %>
  </body>
</html>
