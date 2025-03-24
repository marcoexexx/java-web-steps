package context;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ContentServlet", urlPatterns = "/token")
public class ContentServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("->> config " + getServletName());
    System.out.println("->> info " + getServletInfo());

    Enumeration<String> names = getServletContext().getInitParameterNames();

    while (names.hasMoreElements()) {
      String name = names.nextElement();
      String value = getServletContext().getInitParameter(name);

      System.out.println("name: " + name);
      System.out.println("value: " + value);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doPost(req, resp);
  }
}
