package com.chordstack.todo.model.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2DB {
  private static H2DB instance;

  private Connection conn;

  public static H2DB getInstance() throws SQLException, ClassNotFoundException {
    if (instance == null) {
      System.out.println("CREATED NEW");
      instance = new H2DB();

      Class.forName("org.h2.Driver");

      instance.conn = DriverManager.getConnection("jdbc:h2:~/tododb", "sa", "");
      Statement stmt = instance.conn.createStatement();

      stmt = instance.conn.createStatement();

      // WRAN: For development only, propose a lean tech stack approach
      stmt.execute(
          "DROP TABLE IF EXISTS Todo");

      stmt.execute(
          "CREATE TABLE IF NOT EXISTS Todo (id IDENTITY PRIMARY KEY, title VARCHAR(255) NOT NULL, is_completed BOOLEAN DEFAULT false, description TEXT)");

      stmt.close();
    }

    return instance;
  }

  public Connection getConnection() {
    return conn;
  }
}
