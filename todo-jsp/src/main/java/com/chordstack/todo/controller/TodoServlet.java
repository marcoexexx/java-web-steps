package com.chordstack.todo.controller;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chordstack.todo.model.TodoDAO;
import com.chordstack.todo.model.Todo;

@WebServlet(name = "TodoServlet", urlPatterns = "/task")
public class TodoServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
      TodoDAO todoDAO = new TodoDAO();

      List<Todo> todos = todoDAO.getTodos();

      req.setAttribute("todos", todos);

      getServletContext()
          .getRequestDispatcher("/task.jsp")
          .forward(req, resp);
    } catch (Exception e) {
      req.setAttribute("error", e);

      getServletContext()
          .getRequestDispatcher("/error.jsp")
          .forward(req, resp);
    }
  }
}
