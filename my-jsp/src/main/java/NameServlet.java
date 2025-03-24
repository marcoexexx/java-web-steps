import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    String age = req.getParameter("age");

    StringBuilder err = new StringBuilder();

    // Validation
    if (name == null) {
      err.append("name is required.");
    } else {
      req.setAttribute("name", name);
    }

    if (age == null) {
      err.append("age is required.");
    } else {
      req.setAttribute("age", name);
    }

    if (!err.isEmpty()) {
      req.setAttribute("error", err.toString());
    }

    getServletContext()
        .getRequestDispatcher("/presidents")
        .forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doPost(req, resp);
  }
}
