import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;

/**
 * NOTE:
 * ### **Comparison of Scopes**
 * 
 * 1. **Page Scope**
 * - **Availability**: Only within the JSP page
 * - **Lifetime**: From the request start to response sent
 * - **Use Case**: Temporary data specific to a page (e.g., form data)
 * 
 * 2. **Request Scope**
 * - **Availability**: Across a single request
 * - **Lifetime**: From request start to response sent
 * - **Use Case**: Data passed between servlet and JSP (e.g., form submission,
 * search results)
 * 
 * 3. **Session Scope**
 * - **Availability**: Across multiple requests
 * - **Lifetime**: Duration of the user's session (until timeout)
 * - **Use Case**: User-specific data (e.g., login status, shopping cart)
 * 
 * 4. **Application Scope**
 * - **Availability**: Across all requests and users
 * - **Lifetime**: The entire application's lifespan (until shutdown)
 * - **Use Case**: Global data shared by all users (e.g., configuration,
 * site-wide counters)
 */

@WebServlet(name = "PersonServlet", urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Person person = new Person("Bob", "", 6);

    req.setAttribute("person", person);

    getServletContext()
        .getRequestDispatcher("/person.jsp")
        .forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doPost(req, resp);
  }
}
