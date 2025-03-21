<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="com.example.Hello" %>

<html>
  <body>
    <h2>Hello World!</h2>
    <% out.println(new Hello().data()); %>
  </body>
</html>
