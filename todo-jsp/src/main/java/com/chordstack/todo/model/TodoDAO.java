package com.chordstack.todo.model;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chordstack.todo.model.db.H2DB;

// TODO: impl
// - get by id
// - All of CRUD

public class TodoDAO {
  private H2DB h2db;

  public TodoDAO() throws Exception {
    try {
      this.h2db = H2DB.getInstance();
    } catch (SQLException | ClassNotFoundException e) {
      throw new Exception("Faied to create DAO.");
    }
  }

  public List<Todo> getTodos() throws SQLException {
    Connection conn = this.h2db.getConnection();
    ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Todo");

    List<Todo> todos = new ArrayList<>();

    while (rs.next()) {
      todos.add(new Todo(rs.getString("title"), rs.getBoolean("is_completed"), null));
    }

    rs.close();

    return todos;
  }

  public void create(Todo todo) throws SQLException {
    Connection conn = this.h2db.getConnection();
    String sql = "INSERT INTO Todo (title, is_completed, description) VALUES (?, ?, ?)";

    PreparedStatement pstmt = conn.prepareStatement(sql);

    pstmt.setString(1, todo.getTitle());
    pstmt.setBoolean(2, todo.getIsCompleted());
    pstmt.setString(3, null);

    pstmt.execute();

    pstmt.close();
  }

  public void update(Long id, Todo todo) throws SQLException {
    Connection conn = this.h2db.getConnection();
    String sql = "UPDATE Todo SET title = ?, is_completed = ?, description = ? WHERE id = ?";

    PreparedStatement pstmt = conn.prepareStatement(sql);

    pstmt.setString(1, todo.getTitle()); // Set title
    pstmt.setBoolean(2, todo.getIsCompleted()); // Set is_completed
    pstmt.setString(3, null);
    pstmt.setLong(4, id);

    pstmt.executeUpdate();

    pstmt.close();
  }
}
