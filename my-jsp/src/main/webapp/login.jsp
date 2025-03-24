<%@ page contentType="text/html;charset=UTF-8" language="java" %>

  <html lang="en">

  <body>
    <form method="post" action="login">
      <input type="text" name="username" placeholder="Username" value=""><br />
      <input type="password" name="password" placeholder="Password" value=""><br />
      <input type="submit" value="Submit">
    </form>

    <% String error=(String) request.getAttribute("error"); if (error !=null) { out.println(error); } %>
  </body>

  </html>
