import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AnnotatedServlet", urlPatterns = { "/some", "/other" })
public class AnnotatedServlet extends HttpServlet {
  @Override
  public void init() throws ServletException {
    System.out.println("[ INITIALIZE ] server is start");
  }

  @Override
  public void destroy() {
    System.out.println("[ DESTROY ] server have been destroyed");
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/plain");
    resp.getWriter().write("Rusty");
  }

}
