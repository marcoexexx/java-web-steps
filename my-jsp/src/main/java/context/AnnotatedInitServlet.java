package context;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AnnotatedInitServlet", urlPatterns = "/context/data2", initParams = {
    @WebInitParam(name = "message", value = "hello, world"),
    @WebInitParam(name = "next", value = "java")
})
public class AnnotatedInitServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/plain;charset=UTF-8");
    resp.getWriter().write(String.format("message: %s\nmessage: %s", getServletConfig().getInitParameter("message"),
        getServletConfig().getInitParameter("next")));
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doPost(req, resp);
  }
}
