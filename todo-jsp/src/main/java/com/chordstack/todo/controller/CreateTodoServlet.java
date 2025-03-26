package com.chordstack.todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chordstack.todo.model.TodoDAO;
import com.chordstack.todo.model.Todo;

@WebServlet(name = "CreateTodoServlet", urlPatterns = "/create")
public class CreateTodoServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
      TodoDAO todoDAO = new TodoDAO();
      String title = req.getParameter("title");

      todoDAO.create(new Todo(title, false, null));

      resp.sendRedirect(req.getContextPath() + "/task");
    } catch (Exception e) {
      req.setAttribute("error", e);

      getServletContext()
          .getRequestDispatcher("/error.jsp")
          .forward(req, resp);
    }
  }
}
