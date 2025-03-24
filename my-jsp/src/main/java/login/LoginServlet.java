package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    getServletContext()
        .getRequestDispatcher("/login.jsp")
        .forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String username = req.getParameter("username");
    String password = req.getParameter("password");

    if (username.isEmpty() || password.isEmpty()) { // May empty ("") or null
      req.setAttribute("error", "Faile to login.");
      this.doGet(req, resp);
    } else {
      resp.sendRedirect("presidents");
    }

    System.out.println("Request post recieve " + username + "; " + password + "");
  }
}
